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

    public async Task CreateMember(MemberDTO member)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/member/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }
    }

    public async Task LoginMember(MemberDTO member)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/member/login", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }
    }
}