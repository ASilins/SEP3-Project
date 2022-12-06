package via.sep3.logicserver.model.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.interfaces.WorkoutLogic;
import via.sep3.logicserver.protobuf.WorkoutO;
import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.repositories.logic.WorkoutDAOImpl;
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
    public List<WorkoutO> GetWorkouts() throws Exception {
        return convertListWorkoutsToWorkoutOs(dao.GetWorkouts());
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
}
