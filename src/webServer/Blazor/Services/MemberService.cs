using System.Net.Http.Json;
using System.Text.Json;
using Model.DTOs;

namespace Blazor.Services;

public class MemberService
{
    private readonly HttpClient client;

    public MemberService(HttpClient client)
    {
        this.client = client;
    }

    public async Task CreateMember(Member member)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/Member", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        // Member c = JsonSerializer.Deserialize<Member>(result, new JsonSerializerOptions
        // {
        //     PropertyNameCaseInsensitive = true
        // })!;
        // return ;
    }
}