using System.ComponentModel.DataAnnotations;

namespace Shared.Model;

public class Exercise
{
    [Key]
    public int Id { get; set; }
    //[Required, MinLength(3), MaxLength(30)]
    public string Name { get; set; }
    //[Required, MaxLength(500)]
    public string Description { get; set; }
    //[Range(0, 600)]
    public int DurationInMin { get; set; }
    public ICollection<ExercisesInWorkouts> InWorkouts { get; set; }

    public Member User { get; set; }
}