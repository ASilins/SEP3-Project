package via.sep3.logicserver.repositories.interfaces;

import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutModel;
import via.sep3.logicserver.shared.WorkoutDTO;

import java.util.List;

public interface WorkoutDAO {

    WorkoutModel getWorkout(int id) throws Exception;

    List<WorkoutModel> GetWorkouts() throws Exception;

    FollowWorkoutDTO assignWorkout(FollowWorkoutDTO dto) throws Exception;

    void editWorkout(WorkoutModel workout) throws Exception;

    void deleteWorkout(int id) throws Exception;

    WorkoutDTO createWorkout(WorkoutDTO workoutDTO) throws Exception;
}
