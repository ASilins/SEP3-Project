using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IMemberClient
{
    Task<MemberDTO> CreateMember(LoginCreateDTO member);
    Task<string> LoginMember(LoginCreateDTO member);
    Task EditMember(MemberDTO member);
    Task<IEnumerable<MemberDTO>> GetMembers();
}