using System.ComponentModel.DataAnnotations;

namespace Shared.Model;

public class Member
{
    [Key]
    public int Id { get; set; }
    [Required]
    public string Username { get; set; }
    [Required]
    public string HashedPassword { get; set; }
    [Required]
    public string Position { get; set; }
    public ICollection<Exercise> AddedExercises { get; set; }
    public ICollection<Workout> CreatedWorkouts { get; set; }
    public ICollection<FollowsWorkouts> FollowedWorkouts { get; set; }
}