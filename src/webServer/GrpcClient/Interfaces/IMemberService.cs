using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IMemberService
{
    Task CreateMember(Member member);
}