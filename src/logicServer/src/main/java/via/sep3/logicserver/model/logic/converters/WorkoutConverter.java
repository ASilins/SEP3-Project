package via.sep3.logicserver.model.logic.converters;

import org.springframework.stereotype.Service;
import via.sep3.logicserver.protobuf.*;
import via.sep3.logicserver.shared.ExerciseDTO;
import via.sep3.logicserver.shared.ExercisesInWorkouts;
import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutDTO;
import via.sep3.logicserver.shared.WorkoutModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutConverter {

    public static WorkoutDTO convertToWorkoutDTO(WorkoutObj obj) {
        WorkoutDTO dto = new WorkoutDTO();

        dto.setId(obj.getId());
        dto.setName(obj.getName());
        dto.setDescription(obj.getDescription());
        dto.setDurationInMin(obj.getDurationInMin());
        dto.setCreatedBy(obj.getCreatedBy());
        dto.setPublic(obj.getIsPublic());
        dto.setExercises(ExerciseConverter.convertToExerciseDTOList(obj.getExercisesList()));
        dto.setFollowers(convertToFollowWorkoutList(obj.getFollowersList()));

        return dto;
    }

    public static List<FollowWorkoutDTO> convertToFollowWorkoutDTO(List<AssignWorkoutObj> objs) {
        List<FollowWorkoutDTO> dtos = new ArrayList<FollowWorkoutDTO>();

        for (AssignWorkoutObj obj : objs) {
            dtos.add(convertToFollowWorkoutDTO(obj));
        }

        return dtos;
    }

    public static WorkoutObj convertToWorkoutObj(WorkoutDTO dto) {
        if (dto.getExercises() == null)
            dto.setExercises(new ArrayList<ExerciseDTO>());

        if (dto.getFollowers() == null)
            dto.setFollowers(new ArrayList<FollowWorkoutDTO>());

        return WorkoutObj.newBuilder()
                .setId(dto.getId())
                .setName(dto.getName())
                .setDescription(dto.getDescription())
                .setDurationInMin(dto.getDurationInMin())
                .setCreatedBy(dto.getCreatedBy())
                .setIsPublic(dto.isPublic())
                .addAllExercises(ExerciseConverter.convertToExerciseObjList(dto.getExercises()))
                .addAllFollowers(convertoToAssignWorkoutObjList(dto.getFollowers()))
                .build();
    }

    public static Workout convertToWorkout(WorkoutDTO workoutDTO, MemberObj memberObj) {

        return Workout.newBuilder()
                .setId(workoutDTO.getId())
                .setName(workoutDTO.getName())
                .setDescription(workoutDTO.getDescription())
                .setDurationInMin(workoutDTO.getDurationInMin())
                .setCreatedBy(memberObj)
                .setIsPublic(workoutDTO.isPublic())
                .addAllExercises(ExerciseConverter.convertToExerciseObjList(workoutDTO.getExercises()))
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

    public static List<FollowWorkoutDTO> convertToFollowWorkoutList(List<AssignWorkoutObj> objs) {
        List<FollowWorkoutDTO> dtos = new ArrayList<>();

        for (AssignWorkoutObj obj : objs) {
            dtos.add(convertToFollowWorkoutDTO(obj));
        }

        return dtos;
    }

    public static AssignWorkoutObj convertToAssignWorkoutTO(FollowWorkoutDTO dto) {
        return AssignWorkoutObj.newBuilder()
                .setUserID(dto.getUserID())
                .setWorkoutID(dto.getWorkoutID())
                .build();
    }

    public static List<AssignWorkoutObj> convertoToAssignWorkoutObjList(List<FollowWorkoutDTO> dtos) {
        List<AssignWorkoutObj> objs = new ArrayList<AssignWorkoutObj>();

        if (dtos == null)
            return null;

        for (FollowWorkoutDTO dto : dtos) {
            objs.add(convertToAssignWorkoutTO(dto));
        }

        return objs;
    }

    public static WorkoutDTO convertToWorkoutDTO(WorkoutModel workout, List<ExerciseDTO> dtos) {
        WorkoutDTO dto = new WorkoutDTO();

        dto.setId(workout.getId());
        dto.setName(workout.getName());
        dto.setDescription(workout.getDescription());
        dto.setDurationInMin(workout.getDurationInMin());
        dto.setCreatedBy(workout.getCreatedBy());
        dto.setPublic(workout.isPublic());
        dto.setExercises(dtos);
        dto.setFollowers(workout.getFollowers());

        return dto;
    }

    public static WorkoutModel convertToWorkout(WorkoutDTO dto, List<ExercisesInWorkouts> exercises) {
        WorkoutModel workout = new WorkoutModel();

        workout.setId(dto.getId());
        workout.setName(dto.getName());
        workout.setDescription(dto.getDescription());
        workout.setDurationInMin(dto.getDurationInMin());
        workout.setCreatedBy(dto.getCreatedBy());
        workout.setPublic(dto.isPublic());
        workout.setFollowers(dto.getFollowers());
        workout.setExercises(exercises);

        return workout;
    }
}
