using Model.DTOs;

namespace GrpcClient.Logic.Converters;

public static class MemberConverter
{
    public static LoginCreateObject ConvertToLoginCreateObj(LoginCreateDTO dto)
    {
        return new LoginCreateObject()
        {
            Username = dto.Username,
            Password = dto.Password
        };
    }

    public static MemberDTO ConvertToMemberDTO(MemberObj obj)
    {
        return new MemberDTO()
        {
            Username = obj.Username,
            Password = obj.Password
        };
    }
}