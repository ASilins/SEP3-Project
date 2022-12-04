using Shared.DTOs;

namespace Repositories.Interfaces;

public interface ICreateMemberDAO
{
    Task<MemberDTO> CreateMember(MemberDTO member);
    Task<MemberDTO> LoginMember(MemberDTO member);
}