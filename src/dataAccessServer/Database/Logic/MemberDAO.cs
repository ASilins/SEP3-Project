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

    public async Task<MemberDTO?> GetByUsername(string member)
    {
        Member? exists = await _db.Users.FirstOrDefaultAsync(m =>
            m.Username.ToLower().Equals(member.ToLower())
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

    public async Task<MemberDTO?> GetById(int id)
    {
        Member? exists = await _db.Users.FirstOrDefaultAsync(m =>
            m.Id.Equals(id)
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

    public async Task EditMember(MemberDTO memberDto)
    {
        Member? memberOld = await _db.Users.FirstOrDefaultAsync(m =>
            m.Username.ToLower().Equals(memberDto.Username.ToLower())
        );

        _db.ChangeTracker.Clear();

        Member member = new()
        {
            Id = memberOld.Id,
            Username = memberOld.Username,
            HashedPassword = memberOld.HashedPassword,
            Position = memberOld.Position
        };

        _db.Users.Update(member);
        await _db.SaveChangesAsync();
    }

    public Task<List<MemberDTO>> GetMembers()
    {
        List<MemberDTO> memberDtos = new();

        foreach (var item in _db.Users.ToList())
        {
            memberDtos.Add(new MemberDTO()
            {
                Id = item.Id,
                Username = item.Username,
                Password = null,
                Position = item.Position
            });
        }

        return Task.FromResult(memberDtos);
    }
}