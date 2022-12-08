package via.sep3.logicserver.model.interfaces;

import java.util.List;

import via.sep3.logicserver.protobuf.FollowWorkoutTO;
import via.sep3.logicserver.protobuf.WorkoutO;

public interface WorkoutLogic {

    WorkoutO getWorkout(int id) throws Exception;

    List<WorkoutO> getWorkouts() throws Exception;

    FollowWorkoutTO assignWorkout(FollowWorkoutTO dto) throws Exception;
}
