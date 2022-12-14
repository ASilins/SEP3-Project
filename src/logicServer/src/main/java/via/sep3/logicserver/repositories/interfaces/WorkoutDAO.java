package via.sep3.logicserver.repositories.interfaces;

import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutDTO;

import java.util.List;

public interface WorkoutDAO {

    WorkoutDTO getWorkout(int id) throws Exception;

    List<WorkoutDTO> GetWorkouts() throws Exception;

    FollowWorkoutDTO assignWorkout(FollowWorkoutDTO dto) throws Exception;

    WorkoutDTO editWorkout(WorkoutDTO workout) throws Exception;

    void deleteWorkout(int id) throws Exception;

    WorkoutDTO createWorkout(WorkoutDTO workoutDTO) throws Exception;
}
