using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Text.Json.Serialization;

namespace Shared.Model;

public class FollowsWorkouts
{
    public int UserId { get; set; }
    public int WorkoutId { get; set; }

    [ForeignKey("UserId"), JsonIgnore]
    public Member User { get; set; }
    [ForeignKey("WorkoutId"), JsonIgnore]
    public Workout Workout { get; set; }
}