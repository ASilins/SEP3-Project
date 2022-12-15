using Shared.DTOs;

namespace Database.Interfaces;

public interface IExerciseDAO
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
    Task<List<ExerciseDTO>> GetExercises();
    Task EditExercise(ExerciseDTO exercise);
    Task DeleteExercise(int id);
    Task<ExerciseDTO> GetExercise(int id);
}