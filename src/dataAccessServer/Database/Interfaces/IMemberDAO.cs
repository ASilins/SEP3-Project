using Shared.DTOs;

namespace Database.Interfaces;

public interface IMemberDAO
{
    Task<MemberDTO> CreateMember(LoginCreateDTO member);
    Task<MemberDTO?> GetByUsername(string member);
    Task<MemberDTO?> GetById(int id);
    Task EditMember(MemberDTO memberDto);
    Task<List<MemberDTO>> GetMembers();
    Task DeleteMember(int id);
}