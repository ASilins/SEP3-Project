package via.sep3.logicserver.repositories.interfaces;

import java.util.List;

import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.Workout;

public interface WorkoutDAO {

    Workout getWorkout(int id) throws Exception;

    List<Workout> GetWorkouts() throws Exception;

    FollowWorkoutDTO assignWorkout(FollowWorkoutDTO dto) throws Exception;
}
