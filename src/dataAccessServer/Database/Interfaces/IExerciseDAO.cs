using Shared.DTOs;

namespace Database.Interfaces;

public interface IExerciseDAO
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
    Task<IEnumerable<ExerciseDTO>> GetExercises();
}