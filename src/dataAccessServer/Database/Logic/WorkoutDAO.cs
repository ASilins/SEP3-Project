using Database.Interfaces;
using Shared.DTOs;

namespace Database.Logic;

public class WorkoutDAO : IWorkoutDAO
{

    public Task<WorkoutDTO> GetWorkout(int id)
    {
        return Task.FromResult(new WorkoutDTO
        {
            Id = 1
        });
    }

    public Task<IEnumerable<WorkoutDTO>> GetWorkouts()
    {
        throw new NotImplementedException();
    }

    public Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto)
    {
        // Write impl

        return Task.FromResult(dto);
    }

    public Task<WorkoutDTO> EditWorkout(WorkoutDTO workout)
    {
        // Write impl

        return Task.FromResult(workout);
    }

    public Task<bool> DeleteWorkout(int id)
    {
        // Write impl

        return Task.FromResult(true);
    }
}