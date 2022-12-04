package via.sep3.logicserver.model.logic;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.shared.ExerciseDTO;

@Service
public class ExerciseImpl implements ExerciseLogic {

    private final ExerciseDAO DAO;

    public ExerciseImpl(ExerciseDAO dao) {
        DAO = dao;
    }

    @Override
    public ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception {
        return DAO.createExercise(exercise);
    }

}
