package via.sep3.logicserver.model.interfaces;

import java.util.List;

import via.sep3.logicserver.protobuf.ExerciseObj;
import via.sep3.logicserver.protobuf.Exercises;

public interface ExerciseLogic {
    ExerciseObj createExercise(ExerciseObj exercise) throws Exception;

    Exercises getExercises() throws Exception;
}
