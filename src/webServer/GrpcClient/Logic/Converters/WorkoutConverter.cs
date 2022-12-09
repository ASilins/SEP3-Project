using Model.DTOs;
using Shared.DTOs;

namespace GrpcClient.Logic.Converters;

public static class WorkoutConverter
{
    public static WorkoutObj ConvertToWorkoutObj(WorkoutDTO dto)
    {
        var o = new WorkoutObj()
        {
            Id = dto.Id,
            Name = dto.Name,
            Description = dto.Description,
            DurationInMin = dto.DurationInMin,
            CreatedBy = dto.CreatedBy,
            FollowedBy = dto.FollowedBy,
            IsPublic = dto.IsPublic
        };

        o.Exercises.AddRange(ExerciseConverter.ConvertToExerciseObjList(dto.Exercises));

        return o;
    }

    public static WorkoutDTO ConvertToWorkoutDTO(WorkoutObj obj)
    {
        return new WorkoutDTO()
        {
            Id = obj.Id,
            Name = obj.Name,
            Description = obj.Description,
            DurationInMin = obj.DurationInMin,
            CreatedBy = obj.CreatedBy,
            FollowedBy = obj.FollowedBy,
            IsPublic = obj.IsPublic,
            Exercises = ExerciseConverter.ConvertToExerciseDTOList(obj.Exercises)
        };
    }

    public static List<WorkoutDTO> ConvertToWorkoutDTOList(ICollection<WorkoutObj> objList)
    {
        var l = new List<WorkoutDTO>();

        foreach (var item in objList)
        {
            l.Add(ConvertToWorkoutDTO(item));
        }

        return l;
    }

    public static AssignWorkoutObj ConvertToAssignWorkoutObj(FollowWorkoutDTO dto)
    {
        return new AssignWorkoutObj()
        {
            UserID = dto.UserID,
            WorkoutID = dto.WorkoutID
        };
    }

    public static FollowWorkoutDTO ConvertToFollowWorkoutDTO(AssignWorkoutObj obj)
    {
        return new FollowWorkoutDTO()
        {
            UserID = obj.UserID,
            WorkoutID = obj.WorkoutID
        };
    }
}