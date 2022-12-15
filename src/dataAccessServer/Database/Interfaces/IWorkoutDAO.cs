using Shared.DTOs;
using Shared.Model;

namespace Database.Interfaces;

public interface IWorkoutDAO
{
    Task<WorkoutDTO> GetWorkout(int id);
    Task<List<WorkoutDTO>> GetWorkouts();
    Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto);
    Task EditWorkout(Workout workout);
    Task EditExercisesInWorkout(Workout workout);
    Task DeleteWorkout(int id);
    Task<WorkoutDTO> CreateWorkout(WorkoutDTO workout);
}