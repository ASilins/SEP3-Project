using Model.DTOs;

namespace GrpcClient.Logic.Converters;

public static class ExerciseConverter
{
    public static ExerciseObj ConvertToExerciseObj(ExerciseDTO dto)
    {
        return new ExerciseObj()
        {
            Id = dto.Id,
            Name = dto.Name,
            Description = dto.Description,
            Duration = dto.Duration,
            CreatedBy = dto.CreatedBy
        };
    }

    public static ExerciseDTO ConvertToExerciseDTO(ExerciseObj obj)
    {
        return new ExerciseDTO()
        {
            Id = obj.Id,
            Name = obj.Name,
            Description = obj.Description,
            Duration = obj.Duration,
            CreatedBy = obj.CreatedBy
        };
    }

    public static List<ExerciseDTO> ConvertToExerciseDTOList(ICollection<ExerciseObj> objList)
    {
        var dtoList = new List<ExerciseDTO>();

        foreach (var item in objList)
        {
            dtoList.Add(ConvertToExerciseDTO(item));
        }

        return dtoList;
    }

    public static List<ExerciseObj> ConvertToExerciseObjList(List<ExerciseDTO> dtoList)
    {
        var objList = new List<ExerciseObj>();

        foreach (var item in dtoList)
        {
            objList.Add(ConvertToExerciseObj(item));
        }

        return objList;
    }
}