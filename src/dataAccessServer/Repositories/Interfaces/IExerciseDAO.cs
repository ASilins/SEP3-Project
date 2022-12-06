using Shared.DTOs;

namespace Repositories.Interfaces;

public interface IExerciseDAO
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
}