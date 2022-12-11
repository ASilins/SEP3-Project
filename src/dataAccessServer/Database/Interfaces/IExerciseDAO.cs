using Shared.DTOs;

namespace Database.Interfaces;

public interface IExerciseDAO
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
    Task<List<ExerciseDTO>> GetExercises();
}