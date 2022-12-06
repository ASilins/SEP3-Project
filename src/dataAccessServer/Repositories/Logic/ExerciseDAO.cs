using Repositories.Interfaces;
using Shared.DTOs;

namespace Repositories.Logic;

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