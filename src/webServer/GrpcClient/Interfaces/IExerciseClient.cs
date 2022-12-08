using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IExerciseClient
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
    Task<IEnumerable<ExerciseDTO>> GetExercises();
    List<Exercise> ConvertListExerciseOtoExercise(ICollection<ExerciseO> exercises);
    ICollection<ExerciseO> ConvertListExercisetoExerciseO(List<Exercise> exercises);
}