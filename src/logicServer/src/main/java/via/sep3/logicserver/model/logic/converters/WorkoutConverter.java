package via.sep3.logicserver.model.logic.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.protobuf.AssignWorkoutObj;
import via.sep3.logicserver.protobuf.WorkoutObj;
import via.sep3.logicserver.protobuf.Workouts;
import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutDTO;

@Service
public class WorkoutConverter {

    public static WorkoutDTO convertToWorkoutDTO(WorkoutObj obj) {
        WorkoutDTO dto = new WorkoutDTO();

        dto.setId(obj.getId());
        dto.setName(obj.getName());
        dto.setDescription(obj.getDescription());
        dto.setDurationInMin(obj.getDurationInMin());
        dto.setCreatedBy(obj.getCreatedBy());
        dto.setFollowedBy(obj.getFollowedBy());
        dto.setPublic(obj.getIsPublic());
        dto.setExercises(ExerciseConverter.convertToExerciseDTOList(obj.getExercisesList()));

        return dto;
    }

    public static WorkoutObj convertToWorkoutObj(WorkoutDTO dto) {
        return WorkoutObj.newBuilder()
                .setId(dto.getId())
                .setName(dto.getName())
                .setDescription(dto.getDescription())
                .setDurationInMin(dto.getDurationInMin())
                .setCreatedBy(dto.getCreatedBy())
                .setFollowedBy(dto.getFollowedBy())
                .setIsPublic(dto.isPublic())
                .addAllExercises(ExerciseConverter.convertToExerciseObjList(dto.getExercises()))
                .build();
    }

    public static List<WorkoutDTO> convertToWorkoutDTOList(List<WorkoutObj> objList) {
        List<WorkoutDTO> dtoList = new ArrayList<WorkoutDTO>();

        for (WorkoutObj obj : objList) {
            dtoList.add(convertToWorkoutDTO(obj));
        }

        return dtoList;
    }

    public static List<WorkoutObj> convertToWorkoutObjList(List<WorkoutDTO> dtoList) {
        List<WorkoutObj> objList = new ArrayList<WorkoutObj>();

        for (WorkoutDTO dto : dtoList) {
            objList.add(convertToWorkoutObj(dto));
        }

        return objList;
    }

    public static Workouts convertToWorkouts(List<WorkoutObj> objList) {
        return Workouts.newBuilder()
                .addAllWorkouts(objList)
                .build();
    }

    public static FollowWorkoutDTO convertToFollowWorkoutDTO(AssignWorkoutObj to) {
        FollowWorkoutDTO dto = new FollowWorkoutDTO();
        dto.setUserID(to.getUserID());
        dto.setWorkoutID(to.getWorkoutID());
        return dto;
    }

    public static AssignWorkoutObj convertToAssignWorkoutTO(FollowWorkoutDTO dto) {
        return AssignWorkoutObj.newBuilder()
                .setUserID(dto.getUserID())
                .setWorkoutID(dto.getWorkoutID())
                .build();
    }
}
