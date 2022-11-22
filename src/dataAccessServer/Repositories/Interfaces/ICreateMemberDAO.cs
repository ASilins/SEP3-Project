using Shared;

namespace Repositories.Interfaces;

public interface ICreateMemberDAO
{
    Task<Response> CreateMember(Member member);
}