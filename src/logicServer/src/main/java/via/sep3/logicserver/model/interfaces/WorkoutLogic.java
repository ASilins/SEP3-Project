package via.sep3.logicserver.model.interfaces;

import java.util.List;

import via.sep3.logicserver.protobuf.WorkoutO;

public interface WorkoutLogic {
    WorkoutO getWorkout(int id) throws Exception;
    List<WorkoutO> GetWorkouts() throws Exception;
}
