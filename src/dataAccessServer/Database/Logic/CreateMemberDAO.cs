using Microsoft.EntityFrameworkCore.ChangeTracking;
using Database.Interfaces;
using Shared.DTOs;
using Shared.Model;

namespace Database.Logic;

public class CreateMemberDAO : ICreateMemberDAO
{
    private readonly DataContext _db;

    public CreateMemberDAO(DataContext db)
    {
        _db = db;
    }
    public async Task<MemberDTO> CreateMember(MemberDTO member)
    {
        var mem = new Member()
        {
            Username = member.Username,
            HashedPassword = member.Password,
            Position = "Member"
        };

        EntityEntry<Member> added = await _db.Users.AddAsync(mem);
        await _db.SaveChangesAsync();

        return new MemberDTO()
        {
            Id = added.Entity.Id,
            Username = added.Entity.Username,
        };
    }

    public Task<MemberDTO> LoginMember(MemberDTO member)
    {
        // Access to database

        return Task.FromResult(member);
    }
}