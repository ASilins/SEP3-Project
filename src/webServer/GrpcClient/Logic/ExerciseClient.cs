using Grpc.Net.Client;
using Model.DTOs;

namespace GrpcClient.Interfaces;

public class ExerciseClient : IExerciseClient
{
    public readonly string _url = "http://localhost:6565";
    public LogicServer.LogicServerClient client;

    public async Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.createExerciseAsync(new ExerciseTO
        {
            Name = exercise.Name,
            Description = exercise.Description,
            Duration = exercise.Duration
        });

        return new ExerciseDTO
        {
            Name = reply.Name,
            Description = reply.Description,
            Duration = reply.Duration
        };
    }
}