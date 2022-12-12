using Grpc.Net.Client;
using GrpcClient.Interfaces;
using GrpcClient.Logic.Converters;
using Model.DTOs;

namespace GrpcClient.Logic;

public class MemberClient : IMemberClient
{
    private readonly string _url = "http://localhost:6565";
    private MemberService.MemberServiceClient client;

    public async Task<MemberDTO> CreateMember(LoginCreateDTO dto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new MemberService.MemberServiceClient(channel);

        var reply = await client.createMemberAsync(
            MemberConverter.ConvertToLoginCreateObj(dto)
        );

        return MemberConverter.ConvertToMemberDTO(reply);
    }

    public async Task<MemberDTO> LoginMember(LoginCreateDTO dto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new MemberService.MemberServiceClient(channel);

        var reply = await client.loginMemberAsync(
            MemberConverter.ConvertToLoginCreateObj(dto)
        );

        return MemberConverter.ConvertToMemberDTO(reply);
    }

    public async Task EditPrivilege(MemberDTO member)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new MemberService.MemberServiceClient(channel);

        var reply = await client.editPrivilegeAsync(
            MemberConverter.ConvertToMemberObj(member)
        );
    }

    public async Task<IEnumerable<MemberDTO>> GetMembers()
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new MemberService.MemberServiceClient(channel);

        var reply = await client.getMembersAsync(new StringObj
        {
            Name = ""
        });

        return MemberConverter.ConvertToMemberDTOList(reply.Members_);
    }
}