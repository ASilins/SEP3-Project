using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IMemberClient
{
    Task<MemberDTO> CreateMember(MemberDTO member);
    Task<MemberDTO> LoginMember(MemberDTO member);
}