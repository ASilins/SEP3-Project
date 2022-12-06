using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EfcDataAccess;

public class ExercisesInWorkouts
{
    [ForeignKey(nameof(Exercise))]
    public int ExerciseId { get; set; }
    [ForeignKey(nameof(Workout))]
    public int WorkoutId { get; set; }
    
    public Exercise Exercise { get; set; }
    public Workout Workout { get; set; }
}