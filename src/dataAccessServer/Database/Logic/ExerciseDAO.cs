using Database.Interfaces;
using Microsoft.EntityFrameworkCore.ChangeTracking;
using Shared.DTOs;

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
        var ex = new Shared.Model.Exercise()
        {
            Name = exercise.Name,
            Description = exercise.Description,
            DurationInMin = exercise.Duration
        };

        EntityEntry<Shared.Model.Exercise> added = await _db.Exercises.AddAsync(ex);
        await _db.SaveChangesAsync();

        return new ExerciseDTO()
        {
            Name = added.Entity.Name,
            Description = added.Entity.Description,
            Duration = added.Entity.DurationInMin
        };
    }

    public Task<IEnumerable<ExerciseDTO>> GetExercises()
    {
        throw new NotImplementedException();
    }
}