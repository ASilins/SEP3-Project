package via.sep3.logicserver.repositories.interfaces;

import java.util.List;

import via.sep3.logicserver.shared.Workout;

public interface WorkoutDAO {
    List<Workout> GetWorkouts() throws Exception;
}
