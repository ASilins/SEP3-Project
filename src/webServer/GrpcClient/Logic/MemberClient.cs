using Grpc.Net.Client;
using GrpcClient.Interfaces;
using Model.DTOs;

namespace GrpcClient.Logic;

public class MemberClient : IMemberClient
{
    private readonly string _url = "http://localhost:6565";
    private LogicServer.LogicServerClient client;

    public async Task<Member> CreateMember(Member member)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.createMemberAsync(new CreatedMember
        {
            Username = member.Username,
            Password = member.Password
        });

        return new Member
        {
            Username = reply.Username
        };
    }
}