using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IMemberClient
{
    Task<MemberDTO> CreateMember(LoginCreateDTO member);
    Task<string> LoginMember(LoginCreateDTO member);
    string GetToken();
    Task EditPrivilege(MemberDTO member);
    Task<IEnumerable<MemberDTO>> GetMembers();
}