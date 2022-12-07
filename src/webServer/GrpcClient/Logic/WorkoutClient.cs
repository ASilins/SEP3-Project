using Grpc.Net.Client;
using GrpcClient.Interfaces;
using Model.DTOs;
using Shared.DTOs;

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

    public async Task<Workout> GetWorkout(int id)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.getWorkoutAsync(new WorkoutId
        {
            Id = id
        });

        return FromWorkoutOToWorkout(reply);
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

    public async Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.assignWorkoutAsync(new FollowWorkoutTO
        {
            UserID = dto.UserID,
            WorkoutID = dto.WorkoutID
        });

        return new FollowWorkoutDTO()
        {
            UserID = reply.UserID,
            WorkoutID = reply.WorkoutID
        };
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