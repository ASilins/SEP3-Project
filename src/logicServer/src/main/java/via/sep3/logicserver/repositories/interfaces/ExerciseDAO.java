package via.sep3.logicserver.repositories.interfaces;

import java.util.List;

import via.sep3.logicserver.shared.ExerciseDTO;

public interface ExerciseDAO {
    ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception;

    List<ExerciseDTO> getExercises() throws Exception;
}
