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

        var addedExercises = new List<Exercise>();
        var createdWorkouts = new List<Workout>();

        // foreach (var item in memberOld.AddedExercises)
        // {
        //     addedExercises.Add(new Exercise()
        //     {
        //         Id = item.Id,
        //         Name = item.Name,
        //         Description = item.Description,
        //         DurationInMin = item.DurationInMin,
        //         InWorkouts = item.InWorkouts,
        //         // User = item.User
        //     });
        // }

        // foreach (var item in memberOld.CreatedWorkouts)
        // {
        //     createdWorkouts.Add(new Workout()
        //     {
        //         Id = item.Id,
        //         Name = item.Name,
        //         Description = item.Description,
        //         DurationInMin = item.DurationInMin,
        //         Exercises = item.Exercises,
        //         FollowedBy = item.FollowedBy,
        //         IsPublic = item.IsPublic,
        //         NumberOfExercises = item.NumberOfExercises,
        //         // User = item.User
        //     });
        // }

        // member.AddedExercises = addedExercises;
        member.CreatedWorkouts = createdWorkouts;

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

    public async Task DeleteMember(int id)
    {
        _db.Remove(GetById(id));
        await _db.SaveChangesAsync();
    }
}