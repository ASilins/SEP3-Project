package via.sep3.logicserver.model.interfaces;

import via.sep3.logicserver.protobuf.ExerciseObj;
import via.sep3.logicserver.protobuf.Exercises;

public interface ExerciseLogic {
    ExerciseObj createExercise(ExerciseObj exercise) throws Exception;

    Exercises getExercises() throws Exception;

    void editExercise(ExerciseObj dto) throws Exception;

    void deleteExercise(int id) throws Exception;
}
