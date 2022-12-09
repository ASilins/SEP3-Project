using Grpc.Net.Client;
using Model.DTOs;
using GrpcClient.Logic.Converters;

namespace GrpcClient.Interfaces;

public class ExerciseClient : IExerciseClient
{
    public readonly string _url = "http://localhost:6565";
    public ExerciseService.ExerciseServiceClient client;

    public async Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new ExerciseService.ExerciseServiceClient(channel);

        var reply = await client.CreateExerciseAsync(
            ExerciseConverter.ConvertToExerciseObj(exercise)
        );

        return ExerciseConverter.ConvertToExerciseDTO(reply);
    }

    public async Task<IEnumerable<ExerciseDTO>> GetExercises()
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new ExerciseService.ExerciseServiceClient(channel);

        var reply = await client.GetExercisesAsync(new StringObj
        {
            Name = ""
        });

        return ExerciseConverter.ConvertToExerciseDTOList(reply.Exercises_);
    }
}