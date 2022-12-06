package via.sep3.logicserver.model.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.protobuf.ExerciseTO;
import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.repositories.logic.ExerciseDAOImpl;
import via.sep3.logicserver.shared.ExerciseDTO;

@Service
public class ExerciseImpl implements ExerciseLogic {

    private final ExerciseDAO DAO;

    public ExerciseImpl(ExerciseDAOImpl dao) {
        DAO = dao;
    }

    @Override
    public ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception {
        return DAO.createExercise(exercise);
    }

    @Override
    public List<ExerciseTO> getExercises() throws Exception {
        List<ExerciseDTO> exerciseDTOs = DAO.getExercises();
        List<ExerciseTO> exerciseTOs = new ArrayList<ExerciseTO>();

        for (ExerciseDTO exercise : exerciseDTOs) {
            exerciseTOs.add(ExerciseTO.newBuilder()
                    .setName(exercise.getName())
                    .setDescription(exercise.getDescription())
                    .setDuration(exercise.getDuration())
                    .build());
        }

        return exerciseTOs;
    }

}
