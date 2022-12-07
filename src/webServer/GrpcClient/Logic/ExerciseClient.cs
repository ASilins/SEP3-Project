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

    public async Task<IEnumerable<ExerciseDTO>> GetExercises()
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.getExercisesAsync(new EmptyPar
        {
            Empty = ""
        });

        List<ExerciseDTO> exercises = new();

        foreach (var item in reply.Exercises)
        {
            exercises.Add(new ExerciseDTO()
            {
                Name = item.Name,
                Description = item.Description,
                Duration = item.Duration
            });
        }

        return exercises;
    }

    public List<Exercise> ConvertListExerciseOtoExercise(ICollection<ExerciseO> exercises)
    {
        List<Exercise> response = new();

        foreach (var item in exercises)
        {
            response.Add(FromExerciseToExerciseO(item));
        }

        return response;
    }

    private static Exercise FromExerciseToExerciseO(ExerciseO exercise)
    {
        return new Exercise
        {
            Id = exercise.Id,
            Name = exercise.Name,
            Description = exercise.Description,
            Duration = exercise.Duration
        };
    }
}