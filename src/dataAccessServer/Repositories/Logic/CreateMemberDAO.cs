using Repositories.Interfaces;
using Shared;

namespace Repositories.Logic;

public class CreateMemberDAO : ICreateMemberDAO
{
    public Task<Response> CreateMember(Member member)
    {
        // Access to database

        return Task.FromResult(new Response(member));
    }
}