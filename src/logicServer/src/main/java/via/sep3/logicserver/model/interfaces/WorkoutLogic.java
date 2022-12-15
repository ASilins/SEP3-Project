package via.sep3.logicserver.model.interfaces;

import via.sep3.logicserver.protobuf.AssignWorkoutObj;
import via.sep3.logicserver.protobuf.WorkoutObj;
import via.sep3.logicserver.protobuf.Workouts;

public interface WorkoutLogic {

    WorkoutObj getWorkout(int id) throws Exception;

    Workouts getWorkouts(int id) throws Exception;

    AssignWorkoutObj assignWorkout(AssignWorkoutObj dto) throws Exception;

    void editWorkout(WorkoutObj workout) throws Exception;

    void deleteWorkout(int id) throws Exception;

    WorkoutObj createWorkout(WorkoutObj workoutObj) throws Exception;
}
