using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EfcDataAccess;

public class FollowsWorkouts
{
    [ForeignKey(nameof(User))]
    public int UserId { get; set; }
    [ForeignKey(nameof(Workout))]
    public int WorkoutId { get; set; }
    
    public UserTable User { get; set; }
    public Workout Workout { get; set; }
}