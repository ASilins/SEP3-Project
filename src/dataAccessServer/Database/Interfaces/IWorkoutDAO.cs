using Shared.DTOs;

namespace Database.Interfaces;

public interface IWorkoutDAO
{
    Task<WorkoutDTO> GetWorkout(int id);
    Task<IEnumerable<WorkoutDTO>> GetWorkouts();
    Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto);
    Task<WorkoutDTO> EditWorkout(WorkoutDTO workout);
    Task<bool> DeleteWorkout(int id);
}