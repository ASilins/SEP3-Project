using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Text.Json.Serialization;

namespace Shared.Model;

public class ExercisesInWorkouts
{
    public int? ExerciseId { get; set; }
    public int? WorkoutId { get; set; }

    [ForeignKey("ExerciseId"), JsonIgnore]
    public Exercise Exercise { get; set; }
    [ForeignKey("WorkoutId"), JsonIgnore]
    public Workout Workout { get; set; }
}