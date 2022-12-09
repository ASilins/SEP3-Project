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

    public async Task<WorkoutDTO> GetWorkout(int id)
    {
        HttpResponseMessage response = await _client.GetAsync($"/workout?w={id}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception("Web server error with code: " + response.StatusCode);
        }

        return JsonSerializer.Deserialize<WorkoutDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
    }

    public async Task<List<WorkoutDTO>> GetWorkouts()
    {
        HttpResponseMessage response = await _client.GetAsync("/workouts");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception("Web server error with code: " + response.StatusCode);
        }

        return JsonSerializer.Deserialize<List<WorkoutDTO>>(
            content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
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
}