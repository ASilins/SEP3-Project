using GrpcClient.Interfaces;
using Model.DTOs;
using Grpc.Net.Client;
using GrpcClient.Protos;

namespace GrpcClient.Logic;

public class MemberHttpClient : IMemberService
{
    public async Task CreateMember(Member member)
    {
        using var channel = GrpcChannel.ForAddress("https://localhost:6565");
        var client = new LogicServer.LogicServerClient(channel);

        var reply = await client.createMemberAsync(new CreatedMember
        {
            Username = member.Username,
            Password = member.Password
        });

        if (reply == null)
        {
            throw new Exception("Something went wrong");
        }
    }

}