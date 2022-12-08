using Shared.DTOs;

namespace Database.Interfaces;

public interface ICreateMemberDAO
{
    Task<MemberDTO> CreateMember(MemberDTO member);
    Task<MemberDTO> LoginMember(MemberDTO member);
}