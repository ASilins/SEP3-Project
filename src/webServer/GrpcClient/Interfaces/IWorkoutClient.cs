using Model.DTOs;
using Shared.DTOs;

namespace GrpcClient.Interfaces;

public interface IWorkoutClient
{
    Task<Workout> GetWorkout(int id);
    Task<IEnumerable<Workout>> GetWorkouts();
    Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto);
    Task<Workout> EditWorkout(Workout workout);
    Task DeleteWorkout(int id);
}