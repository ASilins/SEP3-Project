package via.sep3.logicserver.repositories.interfaces;

import via.sep3.logicserver.shared.ExerciseDTO;

public interface ExerciseDAO {
    ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception;
}
