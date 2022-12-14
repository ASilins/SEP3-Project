using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Shared.Model;

public class ExercisesInWorkouts
{
    [Key]
    public int Id { get; set; }
    public int? ExerciseId { get; set; }
    public int? WorkoutId { get; set; }

    [ForeignKey("ExerciseId")]
    public Exercise Exercise { get; set; }
    [ForeignKey("WorkoutId")]
    public Workout Workout { get; set; }
}