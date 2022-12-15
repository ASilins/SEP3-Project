using System.Collections.Generic;
using System.Threading.Tasks;
using Blazor.Services;
using Grpc.Net.Client;
using GrpcClient.Interfaces;
using GrpcClient.Logic.Converters;
using Model.DTOs;
using Shared.DTOs;

namespace GrpcClient.Logic;

public class WorkoutClient : IWorkoutClient
{
    public readonly string _url = "http://localhost:6565";
    public WorkoutService.WorkoutServiceClient client;

    public async Task<WorkoutDTO> GetWorkout(int id)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new WorkoutService.WorkoutServiceClient(channel);

        var reply = await client.GetWorkoutAsync(new IntObj
        {
            Number = id
        });

        return WorkoutConverter.ConvertToWorkoutDTO(reply);
    }

    public async Task<IEnumerable<WorkoutDTO>> GetWorkouts()
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new WorkoutService.WorkoutServiceClient(channel);

        var reply = await client.GetWorkoutsAsync(new StringObj
        {
            Name = ""
        });

        return WorkoutConverter.ConvertToWorkoutDTOList(reply.Workouts_);
    }

    public async Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new WorkoutService.WorkoutServiceClient(channel);

        var reply = await client.AssignWorkoutAsync(
            WorkoutConverter.ConvertToAssignWorkoutObj(dto)
        );

        return WorkoutConverter.ConvertToFollowWorkoutDTO(reply);
    }

    public async Task EditWorkout(WorkoutDTO workout)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new WorkoutService.WorkoutServiceClient(channel);

        var reply = await client.EditWorkoutAsync(
            WorkoutConverter.ConvertToWorkoutObj(workout)
        );
    }

    public async Task DeleteWorkout(int id)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new WorkoutService.WorkoutServiceClient(channel);

        await client.DeleteWorkoutAsync(new IntObj
        {
            Number = id
        });
    }

    public async Task<WorkoutDTO> CreateWorkout(WorkoutDTO workoutDto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new WorkoutService.WorkoutServiceClient(channel);

        var reply = await client.CreateWorkoutAsync(
            WorkoutConverter.ConvertToWorkoutObj(workoutDto)
            );

        return WorkoutConverter.ConvertToWorkoutDTO(reply);
    }
}