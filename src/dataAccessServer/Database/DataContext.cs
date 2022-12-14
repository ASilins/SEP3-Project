using Microsoft.EntityFrameworkCore;
using Shared.Model;

namespace Database;

public class DataContext : DbContext
{
    public DbSet<Member> Users { get; set; }
    public DbSet<Exercise> Exercises { get; set; }
    public DbSet<Workout> Workouts { get; set; }
    public DbSet<FollowsWorkouts> FollowsWorkouts { get; set; }
    public DbSet<ExercisesInWorkouts> ExercisesInWorkouts { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlite("Data source = ../Database/Fitness.db");
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Workout>()
            .Property<int>("CreatedBy").HasDefaultValue(0);

        modelBuilder.Entity<Workout>()
        .HasOne(w => w.User)
        .WithMany(m => m.CreatedWorkouts)
        .HasForeignKey("CreatedBy")
        .IsRequired(false);

        // modelBuilder.Entity<Exercise>()
        //     .Property<int>("AddedBy").HasDefaultValue(0);

        // modelBuilder.Entity<Exercise>()
        // .HasOne(e => e.User)
        // .WithMany(m => m.AddedExercises)
        // .HasForeignKey("AddedBy")
        // .IsRequired(false);

        modelBuilder.Entity<ExercisesInWorkouts>()
        .HasKey(e => new { e.ExerciseId, e.WorkoutId });
        modelBuilder.Entity<FollowsWorkouts>()
        .HasKey(f => new { f.UserId, f.WorkoutId });
    }
}