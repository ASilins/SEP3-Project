using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IExerciseClient
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
}