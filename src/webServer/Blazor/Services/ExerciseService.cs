using System.Net.Http.Json;
using System.Text.Json;
using Model.DTOs;

namespace Blazor.Services;

public class ExerciseService
{
    private readonly HttpClient client;

    public ExerciseService(HttpClient client)
    {
        this.client = client;
    }

    public async Task CreateExercise(ExerciseDTO member)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/api/exercise/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }

    public async Task<List<ExerciseDTO>> GetExercises()
    {
        HttpResponseMessage response = await client.GetAsync("/api/exercises");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        return JsonSerializer.Deserialize<List<ExerciseDTO>>(
            result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
    }

    public async Task EditExercise(ExerciseDTO dto)
    {
        HttpResponseMessage response = await client.PutAsJsonAsync("/api/exercise", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }

    public async Task DeleteExercise(int id)
    {
        await client.DeleteAsync("/api/exercise?e=" + id);
    }
}