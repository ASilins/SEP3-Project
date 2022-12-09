using Shared.DTOs;
using Shared.Model;

namespace Database.Interfaces;

public interface IWorkoutDAO
{
    Task<Workout?> GetWorkout(int id);
    Task<List<WorkoutDTO>> GetWorkouts();
    Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto);
    Task EditWorkout(WorkoutDTO workout);
    Task DeleteWorkout(int id);
}