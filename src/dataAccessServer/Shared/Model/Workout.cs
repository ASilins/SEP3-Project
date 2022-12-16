using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
namespace Shared.Model;

public class Workout
{
    [Key]
    public int Id { get; set; }
    //[Required]
    public string Name { get; set; }
    //[Required]
    public string Description { get; set; }
    public int DurationInMin { get; set; }
    //[Required]
    [DefaultValue(false)]
    public bool IsPublic { get; set; }
    public int CreatedBy { get; set; }


    // For EF Core
    public List<ExercisesInWorkouts>? Exercises { get; set; }
    public List<FollowsWorkouts>? followedWorkouts { get; set; }
}