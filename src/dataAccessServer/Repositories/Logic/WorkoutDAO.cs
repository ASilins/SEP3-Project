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
}