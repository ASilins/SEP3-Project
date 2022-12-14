using Google.Protobuf;
using Model.DTOs;

namespace GrpcClient.Logic.Converters;

public static class MemberConverter
{
    public static LoginCreateObject ConvertToLoginCreateObj(LoginCreateDTO dto)
    {
        return new LoginCreateObject()
        {
            Username = dto.Username,
            Password = ByteString.CopyFrom(dto.Password),
            Salt = ByteString.CopyFrom(dto.Salt)
        };
    }

    public static MemberDTO ConvertToMemberDTO(MemberObj obj)
    {
        return new MemberDTO()
        {
            Username = obj.Username,
            Password = obj.Password.ToByteArray(),
            Salt = obj.Salt.ToByteArray()
        };
    }

    public static MemberObj ConvertToMemberObj(MemberDTO dto)
    {
        return new MemberObj()
        {
            Username = dto.Username,
            Password = ByteString.CopyFrom(dto.Password),
            Salt = ByteString.CopyFrom(dto.Salt),
            Position = dto.Position
        };
    }

    public static List<MemberDTO> ConvertToMemberDTOList(ICollection<MemberObj> memberObjs)
    {
        var list = new List<MemberDTO>();

        foreach (var VARIABLE in memberObjs)
        {
            list.Add(ConvertToMemberDTO(VARIABLE));
        }

        return list;
    }
}