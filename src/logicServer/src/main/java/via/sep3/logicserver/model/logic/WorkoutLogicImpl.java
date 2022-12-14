package via.sep3.logicserver.model.logic;

import org.springframework.stereotype.Service;
import via.sep3.logicserver.model.interfaces.WorkoutLogic;
import via.sep3.logicserver.model.logic.converters.WorkoutConverter;
import via.sep3.logicserver.protobuf.AssignWorkoutObj;
import via.sep3.logicserver.protobuf.WorkoutObj;
import via.sep3.logicserver.protobuf.Workouts;
import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.repositories.logic.WorkoutDAOImpl;

@Service
public class WorkoutLogicImpl implements WorkoutLogic {

    private WorkoutDAO dao;

    public WorkoutLogicImpl(WorkoutDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public WorkoutObj getWorkout(int id) throws Exception {
        return WorkoutConverter.convertToWorkoutObj(dao.getWorkout(id));
    }

    @Override
    public Workouts getWorkouts() throws Exception {
        return WorkoutConverter.convertToWorkouts(
                WorkoutConverter.convertToWorkoutObjList(dao.GetWorkouts()));
    }

    @Override
    public AssignWorkoutObj assignWorkout(AssignWorkoutObj dto) throws Exception {
        return WorkoutConverter.convertToAssignWorkoutTO(
                dao.assignWorkout(
                        WorkoutConverter.convertToFollowWorkoutDTO(dto)));
    }

    @Override
    public WorkoutObj editWorkout(WorkoutObj workout) throws Exception {
        return WorkoutConverter.convertToWorkoutObj(
                dao.editWorkout(WorkoutConverter.convertToWorkoutDTO(workout)));
    }

    @Override
    public void deleteWorkout(int id) throws Exception {
        dao.deleteWorkout(id);
    }

    @Override
    public WorkoutObj createWorkout(WorkoutObj workoutObj) throws Exception {
        return WorkoutConverter.convertToWorkoutObj(
                dao.createWorkout(WorkoutConverter.convertToWorkoutDTO(workoutObj))
        );
    }
}
