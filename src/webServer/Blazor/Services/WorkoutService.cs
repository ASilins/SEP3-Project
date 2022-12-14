using System.Net.Http.Json;
using System.Text.Json;
using Model.DTOs;
using Shared.DTOs;

namespace Blazor.Services;

public class WorkoutService
{
    private readonly HttpClient _client;

    public WorkoutService(HttpClient client)
    {
        _client = client;
    }

    public Task<WorkoutDTO> GetWorkout(int id)
    {
        // Temp for UI testing
        return Task.FromResult(new WorkoutDTO()
        {
            Id = id,
            Name = "workout",
            Description = "sgshsfh",
            DurationInMin = 100,
            IsPublic = false,
            Exercises = new List<ExerciseDTO>()
            {
                new ExerciseDTO() { Id = 4, Name = "sfs", Description = "sdfsee", Duration = 10},
                new ExerciseDTO() { Id = 3, Name = "sfsfs", Description = "sdfseengmfdsg", Duration = 20},
                new ExerciseDTO() { Id = 6, Name = "sfaas", Description = "sdfntrsgmysee", Duration = 10}
            }
        });

        // Real implementation

        // HttpResponseMessage response = await _client.GetAsync($"/workout?w={id}");
        // string content = await response.Content.ReadAsStringAsync();

        // if (!response.IsSuccessStatusCode)
        // {
        //     throw new Exception("Web server error with code: " + response.StatusCode);
        // }

        // return JsonSerializer.Deserialize<WorkoutDTO>(content, new JsonSerializerOptions
        // {
        //     PropertyNameCaseInsensitive = true
        // })!;
    }

    public Task<List<WorkoutDTO>> GetWorkouts()
    {
        return Task.FromResult(new List<WorkoutDTO>()
        {
            new WorkoutDTO()
        {
            Id = 1,
            Name = "workout",
            Description = "sgshsfh",
            DurationInMin = 100,
            IsPublic = false,
            Exercises = new List<ExerciseDTO>()
            {
                new ExerciseDTO() { Id = 4, Name = "sfs", Description = "sdfsee", Duration = 10},
                new ExerciseDTO() { Id = 3, Name = "sfsfs", Description = "sdfseengmfdsg", Duration = 20},
                new ExerciseDTO() { Id = 6, Name = "sfaas", Description = "sdfntrsgmysee", Duration = 10}
            }
        },
        new WorkoutDTO()
        {
            Id = 2,
            Name = "workout",
            Description = "sgshsfh",
            DurationInMin = 100,
            IsPublic = false,
            Exercises = new List<ExerciseDTO>()
            {
                new ExerciseDTO() { Id = 4, Name = "sfs", Description = "sdfsee", Duration = 10},
                new ExerciseDTO() { Id = 3, Name = "sfsfs", Description = "sdfseengmfdsg", Duration = 20},
                new ExerciseDTO() { Id = 6, Name = "sfaas", Description = "sdfntrsgmysee", Duration = 10}
            }
        }
        });

        // HttpResponseMessage response = await _client.GetAsync("/workouts");
        // string content = await response.Content.ReadAsStringAsync();

        // if (!response.IsSuccessStatusCode)
        // {
        //     throw new Exception("Web server error with code: " + response.StatusCode);
        // }

        // return JsonSerializer.Deserialize<List<WorkoutDTO>>(
        //     content, new JsonSerializerOptions
        //     {
        //         PropertyNameCaseInsensitive = true
        //     })!;
    }

    public async Task<FollowWorkoutDTO> AssignWorkout(FollowWorkoutDTO dto)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/workout/assign", dto);
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception("Web server error with code: " + response.StatusCode);
        }

        return JsonSerializer.Deserialize<FollowWorkoutDTO>(
            content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
    }

    public async Task EditWorkout(WorkoutDTO dto)
    {
        await _client.PutAsJsonAsync("/workout", dto);
    }

    public async Task DeleteWorkout(int id)
    {
        await _client.DeleteAsync("/workout?w=" + id);
    }

    public async Task CreateWorkout(WorkoutDTO workoutDto)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/workout/create", workoutDto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }
}