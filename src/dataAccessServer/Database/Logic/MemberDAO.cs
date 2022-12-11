using Microsoft.EntityFrameworkCore.ChangeTracking;
using Microsoft.EntityFrameworkCore;
using Database.Interfaces;
using Shared.DTOs;
using Shared.Model;

namespace Database.Logic;

public class MemberDAO : IMemberDAO
{
    private readonly DataContext _db;

    public MemberDAO(DataContext db)
    {
        _db = db;
    }
    public async Task<MemberDTO> CreateMember(LoginCreateDTO member)
    {
        var mem = new Member()
        {
            Username = member.Username,
            HashedPassword = member.Password,
            Salt = member.Salt,
            Position = "Member"
        };

        EntityEntry<Member> added = await _db.Users.AddAsync(mem);
        await _db.SaveChangesAsync();

        return new MemberDTO()
        {
            Id = added.Entity.Id,
            Username = added.Entity.Username,
            Position = added.Entity.Position
        };
    }

    public async Task<MemberDTO?> GetByUsername(LoginCreateDTO member)
    {
        Member? exists = await _db.Users.FirstOrDefaultAsync(m =>
            m.Username.ToLower().Equals(member.Username.ToLower())
        );

        if (exists == null)
        {
            return null;
        }

        return new MemberDTO()
        {
            Id = exists.Id,
            Username = exists.Username,
            Password = exists.HashedPassword,
            Salt = exists.Salt,
            Position = exists.Position
        };
    }
}