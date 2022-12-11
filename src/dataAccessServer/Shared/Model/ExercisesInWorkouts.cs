using System.ComponentModel.DataAnnotations.Schema;

namespace Shared.Model;

public class ExercisesInWorkouts
{
    [ForeignKey(nameof(Exercise))]
    public int ExerciseId { get; set; }
    [ForeignKey(nameof(Workout))]
    public int WorkoutId { get; set; }

    public Exercise Exercise { get; set; }
    public Workout Workout { get; set; }
}