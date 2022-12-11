using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IMemberClient
{
    Task<MemberDTO> CreateMember(LoginCreateDTO member);
    Task<string> LoginMember(LoginCreateDTO member);
}