package via.sep3.logicserver.model.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.interfaces.WorkoutLogic;
import via.sep3.logicserver.protobuf.FollowWorkoutTO;
import via.sep3.logicserver.protobuf.WorkoutO;
import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.repositories.logic.WorkoutDAOImpl;
import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.Workout;

@Service
public class WorkoutLogicImpl implements WorkoutLogic {

    private WorkoutDAO dao;
    private ExerciseLogic exerciseLogic;

    public WorkoutLogicImpl(WorkoutDAOImpl dao, ExerciseLogicImpl exerciseLogic) {
        this.dao = dao;
        this.exerciseLogic = exerciseLogic;
    }

    @Override
    public WorkoutO getWorkout(int id) throws Exception {
        return fromWorkoutToWorkoutO(dao.getWorkout(id));
    }

    @Override
    public List<WorkoutO> getWorkouts() throws Exception {
        return convertListWorkoutsToWorkoutOs(dao.GetWorkouts());
    }

    @Override
    public FollowWorkoutTO assignWorkout(FollowWorkoutTO dto) throws Exception {
        return convertFollWorkDTOToFollWorkTO(
                dao.assignWorkout(convertFollWorkTOToFollWorkDTO(dto)));
    }

    @Override
    public WorkoutO editWorkout(WorkoutO workout) throws Exception {
        return fromWorkoutToWorkoutO(dao.editWorkout(fromWorkoutOToworkout(workout)));
    }

    @Override
    public void deleteWorkout(int id) throws Exception {
        dao.deleteWorkout(id);
    }

    // On to converter class

    private FollowWorkoutDTO convertFollWorkTOToFollWorkDTO(FollowWorkoutTO to) {
        FollowWorkoutDTO dto = new FollowWorkoutDTO();
        dto.setUserID(to.getUserID());
        dto.setWorkoutID(to.getWorkoutID());
        return dto;
    }

    private FollowWorkoutTO convertFollWorkDTOToFollWorkTO(FollowWorkoutDTO dto) {
        return FollowWorkoutTO.newBuilder()
                .setUserID(dto.getUserID())
                .setWorkoutID(dto.getWorkoutID())
                .build();
    }

    private List<WorkoutO> convertListWorkoutsToWorkoutOs(List<Workout> workouts) {
        List<WorkoutO> workoutOs = new ArrayList<WorkoutO>();

        for (Workout workout : workouts) {
            workoutOs.add(fromWorkoutToWorkoutO(workout));
        }

        return workoutOs;
    }

    private WorkoutO fromWorkoutToWorkoutO(Workout workout) {
        return WorkoutO.newBuilder()
                .setId(workout.getId())
                .setName(workout.getName())
                .setDescription(workout.getDescription())
                .setDurationInMin(workout.getDurationInMin())
                .setCreatedBy(workout.getCreatedBy())
                .setFollowedBy(workout.getFollowedBy())
                .setIsPublic(workout.isPublic())
                .addAllExercises(exerciseLogic.convertListFromExercisesToExerciseOs(workout.getExercises()))
                .build();
    }

    private Workout fromWorkoutOToworkout(WorkoutO workout) {
        Workout response = new Workout();

        response.setId(workout.getId());
        response.setName(workout.getName());
        response.setDescription(workout.getDescription());
        response.setDurationInMin(workout.getDurationInMin());
        response.setCreatedBy(workout.getCreatedBy());
        response.setFollowedBy(workout.getFollowedBy());
        response.setPublic(workout.getIsPublic());
        response.setExercises(exerciseLogic.convertListFromExerciseOsToExercises(workout.getExercisesList()));

        return response;
    }
}
