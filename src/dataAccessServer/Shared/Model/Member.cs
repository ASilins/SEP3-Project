using System.ComponentModel.DataAnnotations;

namespace Shared.Model;

public class Member
{
    [Key]
    public int Id { get; set; }
    [Required]
    public string Username { get; set; }
    [Required]
    public byte[] HashedPassword { get; set; }
    [Required]
    public byte[] Salt { get; set; }
    [Required]
    public string? Position { get; set; }


    // For EF Core
    public ICollection<Workout>? CreatedWorkouts { get; set; }
    public ICollection<FollowsWorkouts>? FollowedWorkouts { get; set; }
}