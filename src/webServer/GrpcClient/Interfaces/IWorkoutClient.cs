using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IWorkoutClient
{
    Task<IEnumerable<Workout>> GetWorkouts();
}