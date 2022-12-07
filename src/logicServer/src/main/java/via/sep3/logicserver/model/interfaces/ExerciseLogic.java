package via.sep3.logicserver.model.interfaces;

import java.util.List;

import via.sep3.logicserver.protobuf.ExerciseTO;
import via.sep3.logicserver.shared.ExerciseDTO;

public interface ExerciseLogic {
    ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception;

    List<ExerciseTO> getExercises() throws Exception;
}
