using System.ComponentModel.DataAnnotations.Schema;

namespace Shared.Model;

public class FollowsWorkouts
{
    [ForeignKey(nameof(User))]
    public int UserId { get; set; }
    [ForeignKey(nameof(Workout))]
    public int WorkoutId { get; set; }

    public Member User { get; set; }
    public Workout Workout { get; set; }
}