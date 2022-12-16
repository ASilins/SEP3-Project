using System.Net.Http.Json;
using System.Text.Json;
using Blazored.LocalStorage;
using Model.DTOs;

namespace Blazor.Services;

public class MemberService
{
    private readonly HttpClient _client;
    private readonly ILocalStorageService _localStorage;

    public MemberService(HttpClient client, ILocalStorageService localStorage)
    {
        _client = client;
        _localStorage = localStorage;
    }

    public async Task CreateMember(MemberDTO member)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/api/member/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }
    }

    public async Task LoginMember(MemberDTO member)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/api/member/login", member);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }

        LoginDTO dto = JsonSerializer.Deserialize<LoginDTO>(
            result, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;

        await _localStorage.SetItemAsync("token", dto.Token);
    }

    public async Task EditMember(MemberDTO member)
    {
        await _client.PutAsJsonAsync("/user/privilege", member);
    }

    public async Task<List<MemberDTO>> GetMembers()
    {
        HttpResponseMessage response = await _client.GetAsync("/api/Members");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception("Web server error with code: " + response.StatusCode);
        }

        return JsonSerializer.Deserialize<List<MemberDTO>>(
            content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true,
                IgnoreNullValues = true
            })!;
    }

    public async Task DeleteMember(int id)
    {
        await _client.DeleteAsync("/api/member?w=" + id);
    }
}