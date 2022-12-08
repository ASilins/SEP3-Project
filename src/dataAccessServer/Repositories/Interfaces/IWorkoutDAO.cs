using Shared.DTOs;

namespace Repositories.Interfaces;

public interface IWorkoutDAO
{
    Task<Workout> GetWorkout(int id);
    Task<IEnumerable<Workout>> GetWorkouts();
    Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto);
    Task<Workout> EditWorkout(Workout workout);
    Task<bool> DeleteWorkout(int id);
}