using Grpc.Net.Client;
using GrpcClient.Interfaces;
using GrpcClient.Logic.Converters;
using Model.DTOs;
using GrpcClient.Logic.Security;

namespace GrpcClient.Logic;

public class MemberClient : IMemberClient
{
    private readonly string _url = "http://localhost:6565";
    private MemberService.MemberServiceClient client;
    private readonly Tokens _tokens;

    public MemberClient(Tokens tokens)
    {
        _tokens = tokens;
    }

    public async Task<MemberDTO> CreateMember(LoginCreateDTO dto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new MemberService.MemberServiceClient(channel);

        PasswordHashing.HashPassword(dto.Password.ToString()!, out byte[] passwordHash, out byte[] passwordSalt);

        dto.Password = passwordHash;
        dto.Salt = passwordSalt;

        var reply = await client.createMemberAsync(
            MemberConverter.ConvertToLoginCreateObj(dto)
        );

        return MemberConverter.ConvertToMemberDTO(reply);
    }

    public async Task<string> LoginMember(LoginCreateDTO dto)
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new MemberService.MemberServiceClient(channel);

        var reply = MemberConverter.ConvertToMemberDTO(
            await client.loginMemberAsync(
            MemberConverter.ConvertToLoginCreateObj(new LoginCreateDTO
            {
                Username = dto.Username
            }))
        );

        if (!PasswordHashing.VerifyPasswordHash(dto.Password.ToString()!, reply.Password!, reply.Salt!))
        {
            throw new Exception("Wrong password");
        }

        return _tokens.CreateToken(reply);
    }
}