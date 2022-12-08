using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EfcDataAccess;

public class Workout
{
    [Key]
    public int Id { get; set; }
    //[Required]
    public string Name { get; set; }
    //[Required]
    public string Description { get; set; }
    public int DurationInMin { get; set; }
    public int NumberOfExercises { get; set; }
    public int FollowedBy { get; set; }
    //[Required]
    public bool IsPublic { get; set; }
    public ICollection<ExercisesInWorkouts> Exercices { get; set; }
    
    public UserTable User { get; set; }
}