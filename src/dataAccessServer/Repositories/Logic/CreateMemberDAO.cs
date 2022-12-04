using Repositories.Interfaces;
using Shared;
using Shared.DTOs;

namespace Repositories.Logic;

public class CreateMemberDAO : ICreateMemberDAO
{
    public Task<MemberDTO> CreateMember(MemberDTO member)
    {
        // Access to database

        return Task.FromResult(member);
    }

    public Task<MemberDTO> LoginMember(MemberDTO member)
    {
        // Access to database

        return Task.FromResult(member);
    }
}