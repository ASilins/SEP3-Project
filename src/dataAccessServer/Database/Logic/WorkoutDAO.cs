using Database.Interfaces;
using Shared.DTOs;
using Shared.Model;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace Database.Logic;

public class WorkoutDAO : IWorkoutDAO
{
    private readonly DataContext _db;

    public WorkoutDAO(DataContext db)
    {
        _db = db;
    }

    public async Task<WorkoutDTO> GetWorkout(int id)
    {
        Workout? query = await _db.Workouts.FirstOrDefaultAsync(w =>
            w.Id == id
        );

        if (query == null)
        {
            throw new Exception("Workout not found");
        }

        var dto = new WorkoutDTO()
        {
            Id = query.Id,
            Name = query.Name,
            Description = query.Description,
            DurationInMin = query.DurationInMin,
            IsPublic = query.IsPublic
        };

        List<ExercisesInWorkouts> temp = _db.ExercisesInWorkouts.Where(
            e => e.WorkoutId == dto.Id
        ).ToList();

        return dto;
    }

    public Task<List<WorkoutDTO>> GetWorkouts()
    {
        List<WorkoutDTO> dtos = new();
        List<ExercisesInWorkouts> temp = new();
        List<FollowsWorkouts> followers = new();

        foreach (var item in _db.Workouts.ToList())
        {
            WorkoutDTO dto = new WorkoutDTO()
            {
                Id = item.Id,
                Name = item.Name,
                Description = item.Description,
                DurationInMin = item.DurationInMin,
                CreatedBy = item.CreatedBy,
                IsPublic = item.IsPublic,
            };

            temp = _db.ExercisesInWorkouts.Where(
                e => e.WorkoutId == item.Id
            ).ToList();

            followers = _db.FollowsWorkouts.Where(
                m => m.WorkoutId == item.Id
            ).ToList();

            dto.Exercises = temp;
            dto.Followers = followers;

            dtos.Add(dto);
        }

        return Task.FromResult(dtos);
    }

    public async Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto)
    {
        await _db.FollowsWorkouts.AddAsync(new FollowsWorkouts()
        {
            UserId = dto.UserID,
            WorkoutId = dto.WorkoutID
        });

        await _db.SaveChangesAsync();

        return dto;
    }

    public async Task EditWorkout(Workout workout)
    {
        _db.ChangeTracker.Clear();

        _db.Workouts.Update(workout);
        await _db.SaveChangesAsync();
    }

    public async Task EditExercisesInWorkout(Workout workout)
    {
        _db.ChangeTracker.Clear();

        _db.ExercisesInWorkouts.UpdateRange(workout.Exercises);
        await _db.SaveChangesAsync();
    }

    public async Task DeleteWorkout(int id)
    {
        WorkoutDTO workout = await GetWorkout(id);
        if (workout == null) throw new Exception("Workout not found");

        var wo = new Workout()
        {
            Id = workout.Id,
            Name = workout.Name,
            Description = workout.Description,
            DurationInMin = workout.DurationInMin,
            Exercises = workout.Exercises,
            IsPublic = workout.IsPublic
        };
        _db.ChangeTracker.Clear();
        _db.Remove(wo);
        await _db.SaveChangesAsync();
    }

    public async Task DeleteExercisesInWorkout(int id)
    {
        WorkoutDTO w = await GetWorkout(id);
        if (w.Exercises == null) return;

        _db.RemoveRange(w.Exercises);
        await _db.SaveChangesAsync();
    }

    public async Task<WorkoutDTO> CreateWorkout(WorkoutDTO workout)
    {
        Workout w = new()
        {
            Id = workout.Id,
            Name = workout.Name,
            Description = workout.Description,
            DurationInMin = workout.DurationInMin,
            Exercises = workout.Exercises,
            CreatedBy = workout.CreatedBy,
            IsPublic = workout.IsPublic
        };

        EntityEntry<Workout> added = await _db.Workouts.AddAsync(w);
        await _db.SaveChangesAsync();

        return new WorkoutDTO()
        {
            Id = added.Entity.Id,
            Name = added.Entity.Name,
            Description = added.Entity.Description,
            DurationInMin = added.Entity.DurationInMin,
            Exercises = added.Entity.Exercises,
            IsPublic = added.Entity.IsPublic
        };
    }
}