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
        HttpResponseMessage response = await _client.PostAsJsonAsync("/member/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result + ">>>" + response.StatusCode);
        }
    }

    public async Task LoginMember(MemberDTO member)
    {
        // HttpResponseMessage response = await _client.PostAsJsonAsync("/member/login", member);
        // string result = await response.Content.ReadAsStringAsync();
        // if (!response.IsSuccessStatusCode)
        // {
        //     throw new Exception(result + ">>>" + response.StatusCode);
        // }

        HttpResponseMessage response = await _client.GetAsync("/member/token");

        string result = await response.Content.ReadAsStringAsync();
        await _localStorage.SetItemAsync("token", result);
    }
}