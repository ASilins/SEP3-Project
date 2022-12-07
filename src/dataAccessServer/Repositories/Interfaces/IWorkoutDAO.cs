using Shared.DTOs;

namespace Repositories.Interfaces;

public interface IWorkoutDAO
{
    Task<IEnumerable<Workout>> GetWorkouts();
}