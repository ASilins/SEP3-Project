using Grpc.Net.Client;
using GrpcClient.Interfaces;
using Model.DTOs;

namespace GrpcClient.Logic;

public class WorkoutClient : IWorkoutClient
{
    private readonly IExerciseClient _exerciseClient;
    public readonly string _url = "http://localhost:6565";
    public LogicServer.LogicServerClient client;

    public WorkoutClient(IExerciseClient exerciseClient)
    {
        _exerciseClient = exerciseClient;
    }

    public async Task<IEnumerable<Workout>> GetWorkouts()
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.getWorkoutsAsync(new EmptyPar
        {
            Empty = ""
        });

        List<Workout> workouts = new();

        foreach (var item in reply.Workouts)
        {
            workouts.Add(FromWorkoutOToWorkout(item));
        }

        return workouts;
    }

    private Workout FromWorkoutOToWorkout(WorkoutO workout)
    {
        return new Workout
        {
            Id = workout.Id,
            Name = workout.Name,
            Description = workout.Description,
            DurationInMin = workout.DurationInMin,
            CreatedBy = workout.CreatedBy,
            FollowedBy = workout.FollowedBy,
            IsPublic = workout.IsPublic,
            Exercises = _exerciseClient.ConvertListExerciseOtoExercise(workout.Exercises)
        };
    }
}