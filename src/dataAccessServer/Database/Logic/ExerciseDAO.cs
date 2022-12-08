using Database.Interfaces;
using Shared.DTOs;

namespace Database.Logic;

public class ExerciseDAO : IExerciseDAO
{
    public Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise)
    {
        // Access to database

        return Task.FromResult(exercise);
    }

    public Task<IEnumerable<ExerciseDTO>> GetExercises()
    {
        throw new NotImplementedException();
    }
}