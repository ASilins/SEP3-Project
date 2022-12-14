using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Shared.Model;

public class FollowsWorkouts
{
    [Key]
    public int Id { get; set; }
    public int UserId { get; set; }
    public int WorkoutId { get; set; }

    [ForeignKey("UserId")]
    public Member User { get; set; }
    [ForeignKey("WorkoutId")]
    public Workout Workout { get; set; }
}