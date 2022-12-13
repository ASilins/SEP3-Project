using Database.Interfaces;
using Shared.DTOs;
using Shared.Model;
using Microsoft.EntityFrameworkCore;

namespace Database.Logic;

public class WorkoutDAO : IWorkoutDAO
{
    private readonly DataContext _db;

    public WorkoutDAO(DataContext db)
    {
        _db = db;
    }

    public Task<Workout?> GetWorkout(int id)
    {
        var query = _db.Workouts.FirstOrDefaultAsync(w =>
        w.Id == id
        );

        return query;
    }

    public Task<List<WorkoutDTO>> GetWorkouts()
    {
        List<WorkoutDTO> dtos = new();

        foreach (var item in _db.Workouts.ToList())
        {
            dtos.Add(new WorkoutDTO()
            {
                Id = item.Id,
                Name = item.Name,
                Description = item.Description,
                DurationInMin = item.DurationInMin,
                CreatedBy = (int)_db.Entry(item).Property("CreatedBy").CurrentValue,
                FollowedBy = item.FollowedBy,
                IsPublic = item.IsPublic,
                Exercises = (List<ExerciseDTO>)item.Exercises
            });
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

    public async Task EditWorkout(WorkoutDTO workout)
    {
        _db.ChangeTracker.Clear();

        Workout w = new()
        {
            Id = workout.Id,
            Name = workout.Name ?? "",
            Description = workout.Description ?? "",
            DurationInMin = workout.DurationInMin,
            FollowedBy = workout.FollowedBy,
            IsPublic = workout.IsPublic
        };

        var exercises = new List<Exercise>();

        foreach (var item in workout.Exercises)
        {
            exercises.Add(new Exercise()
            {
                Id = item.Id,
                Name = item.Name ?? "",
                Description = item.Description ?? "",
                DurationInMin = item.Duration
            });
        }

        w.Exercises = exercises;

        _db.Workouts.Update(w);
        await _db.SaveChangesAsync();
    }

    public async Task DeleteWorkout(int id)
    {
        _db.Remove(GetWorkout(id));
        await _db.SaveChangesAsync();
    }
}