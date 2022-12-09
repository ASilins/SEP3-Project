using Model.DTOs;
using Shared.DTOs;

namespace GrpcClient.Interfaces;

public interface IWorkoutClient
{
    Task<WorkoutDTO> GetWorkout(int id);
    Task<IEnumerable<WorkoutDTO>> GetWorkouts();
    Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto);
    Task EditWorkout(WorkoutDTO workout);
    Task DeleteWorkout(int id);
}