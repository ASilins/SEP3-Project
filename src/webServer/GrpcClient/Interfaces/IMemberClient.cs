using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IMemberClient
{
    Task<Member> CreateMember(Member member);
}