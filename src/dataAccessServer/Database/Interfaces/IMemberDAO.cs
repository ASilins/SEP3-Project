using Shared.DTOs;

namespace Database.Interfaces;

public interface IMemberDAO
{
    Task<MemberDTO> CreateMember(LoginCreateDTO member);
    Task<MemberDTO?> GetByUsername(LoginCreateDTO member);
    Task EditMember(MemberDTO memberDto);
    Task<List<MemberDTO>> GetMembers();
}