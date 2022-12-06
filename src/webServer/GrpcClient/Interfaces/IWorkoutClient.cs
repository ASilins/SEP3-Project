using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IWorkoutClient
{
    Task<Workout> GetWorkout(int id);
    Task<IEnumerable<Workout>> GetWorkouts();
}