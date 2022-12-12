using System.Net.Http.Json;
using System.Text.Json;
using Model.DTOs;

namespace Blazor.Services;

public class MemberService
{
    private readonly HttpClient _client;

    public MemberService(HttpClient client)
    {
        _client = client;
    }

    public async Task CreateMember(MemberDTO member)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/member/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }
    }

    public async Task LoginMember(MemberDTO member)
    {
        HttpResponseMessage response = await _client.PostAsJsonAsync("/member/login", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }
    }

    public async Task EditPrivilege(MemberDTO member)
    {
        await _client.PutAsJsonAsync("/user/privilege", member);
    }

    public async Task<List<MemberDTO>> GetMembers()
    {
        HttpResponseMessage response = await _client.GetAsync("/Members");
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
}