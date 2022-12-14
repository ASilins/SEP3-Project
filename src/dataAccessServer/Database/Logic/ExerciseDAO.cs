using Database.Interfaces;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;
using Shared.DTOs;
using Shared.Model;

namespace Database.Logic;

public class ExerciseDAO : IExerciseDAO
{

    private readonly DataContext _db;

    public ExerciseDAO(DataContext db)
    {
        _db = db;
    }

    //Change return to exercise object
    public async Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise)
    {
        var ex = new Exercise()
        {
            Name = exercise.Name ?? "empty",
            Description = exercise.Description ?? "empty",
            DurationInMin = exercise.Duration
        };

        EntityEntry<Exercise> added = await _db.Exercises.AddAsync(ex);
        await _db.SaveChangesAsync();

        _db.Entry(ex).Property("AddedBy").CurrentValue = exercise.CreatedBy;

        return new ExerciseDTO()
        {
            Id = added.Entity.Id,
            Name = added.Entity.Name,
            Description = added.Entity.Description,
            Duration = added.Entity.DurationInMin
        };
    }

    public async Task<ExerciseDTO> GetExercise(int id)
    {
        Exercise? ex = await _db.Exercises.FirstOrDefaultAsync(e =>
        e.Id == id);

        if (ex == null) throw new Exception("Exercise not found");

        return new ExerciseDTO
        {
            Id = ex.Id,
            Name = ex.Name,
            Description = ex.Description,
            Duration = ex.DurationInMin
        };
    }

    public Task<List<ExerciseDTO>> GetExercises()
    {
        List<ExerciseDTO> dtos = new();

        foreach (var item in _db.Exercises.ToList())
        {
            dtos.Add(new ExerciseDTO()
            {
                Id = item.Id,
                Name = item.Name,
                Description = item.Description,
                Duration = item.DurationInMin,
                CreatedBy = (int?)_db.Entry(item).Property("AddedBy").CurrentValue
            });
        }

        return Task.FromResult(dtos);
    }

    public async Task EditExercise(ExerciseDTO exercise)
    {
        _db.ChangeTracker.Clear();
        _db.Exercises.Update(new Exercise
        {
            Id = exercise.Id,
            Name = exercise.Name ?? "",
            Description = exercise.Description ?? "",
            DurationInMin = exercise.Duration
        });

        await _db.SaveChangesAsync();
    }

    public async Task DeleteExercise(int id)
    {
        _db.Remove(GetExercise(id));
        await _db.SaveChangesAsync();
    }
}
