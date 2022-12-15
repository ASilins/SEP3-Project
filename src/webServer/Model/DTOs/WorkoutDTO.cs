using Shared.DTOs;

namespace Model.DTOs;

public class WorkoutDTO
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public int DurationInMin { get; set; }
    public int NumberOfExercises()
    {
        return Exercises.Count;
    }
    public int CreatedBy { get; set; }
    public int FollowedBy { get; set; }
    public bool IsPublic { get; set; }
    public List<ExerciseDTO>? Exercises { get; set; }
    public List<FollowWorkoutDTO>? Followers;
}