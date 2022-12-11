package via.sep3.logicserver.repositories.interfaces;

import java.util.List;

import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutDTO;

public interface WorkoutDAO {

    WorkoutDTO getWorkout(int id) throws Exception;

    List<WorkoutDTO> GetWorkouts() throws Exception;

    FollowWorkoutDTO assignWorkout(FollowWorkoutDTO dto) throws Exception;

    WorkoutDTO editWorkout(WorkoutDTO workout) throws Exception;

    void deleteWorkout(int id) throws Exception;
}
