package via.sep3.logicserver.model.interfaces;

import java.util.List;

import via.sep3.logicserver.protobuf.WorkoutO;

public interface WorkoutLogic {
    List<WorkoutO> GetWorkouts() throws Exception;
}
