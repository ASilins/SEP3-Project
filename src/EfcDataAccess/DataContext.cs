using System.ComponentModel.DataAnnotations.Schema;
using Microsoft.EntityFrameworkCore;

namespace EfcDataAccess;

public class DataContext : DbContext
{
    public DbSet<UserTable> Users { get; set; }
    public DbSet<Exercise> Exercises { get; set; }
    public DbSet<Workout> Workouts { get; set; }
    public DbSet<FollowsWorkouts> FollowsWorkouts { get; set; }
    public DbSet<ExercisesInWorkouts> ExercisesInWorkouts { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlite("Data source = Fitness.db");
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Workout>()
            .Property<int>("CreatedBy");
        
        modelBuilder.Entity<Exercise>()
            .Property<int>("AddedBy");

        modelBuilder.Entity<ExercisesInWorkouts>().HasKey(e => new { e.ExerciseId, e.WorkoutId });
        modelBuilder.Entity<FollowsWorkouts>().HasKey(f => new { f.UserId, f.WorkoutId });
    }
}