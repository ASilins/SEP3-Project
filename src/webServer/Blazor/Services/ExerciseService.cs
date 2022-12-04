using System.Net.Http.Json;
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
        HttpResponseMessage response = await client.PostAsJsonAsync("/exercise/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }
}