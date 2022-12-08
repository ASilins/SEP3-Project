using Repositories.Interfaces;
using Shared.DTOs;

namespace Repositories.Logic;

public class WorkoutDAO : IWorkoutDAO
{

    public Task<Workout> GetWorkout(int id)
    {
        return Task.FromResult(new Workout
        {
            Id = 1
        });
    }

    public Task<IEnumerable<Workout>> GetWorkouts()
    {
        throw new NotImplementedException();
    }

    public Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto)
    {
        // Write impl

        return Task.FromResult(dto);
    }

    public Task<Workout> EditWorkout(Workout workout)
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