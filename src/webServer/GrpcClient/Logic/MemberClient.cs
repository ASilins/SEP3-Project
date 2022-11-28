using Grpc.Net.Client;
using GrpcClient.Interfaces;
using Model.DTOs;

namespace GrpcClient.Logic;

public class MemberClient : IMemberClient
{
    private readonly string _url = "http://localhost:6565";
    private LogicServer.LogicServerClient client;

    public async Task<MemberDTO> CreateMember(MemberDTO member)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.createMemberAsync(new MemberTO
        {
            Username = member.Username,
            Password = member.Password
        });

        return new MemberDTO
        {
            Username = reply.Username
        };
    }

    public async Task<MemberDTO> LoginMember(MemberDTO member)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.createMemberAsync(new MemberTO
        {
            Username = member.Username,
            Password = member.Password
        });

        return new MemberDTO
        {
            Username = reply.Username
        };
    }
}