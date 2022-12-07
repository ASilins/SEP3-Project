using Repositories.Interfaces;
using Shared.DTOs;

namespace Repositories.Logic;

public class WorkoutDAO : IWorkoutDAO
{
    public Task<IEnumerable<Workout>> GetWorkouts()
    {
        throw new NotImplementedException();
    }
}