package via.sep3.logicserver.model.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.protobuf.ExerciseO;
import via.sep3.logicserver.protobuf.ExerciseTO;
import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.repositories.logic.ExerciseDAOImpl;
import via.sep3.logicserver.shared.Exercise;
import via.sep3.logicserver.shared.ExerciseDTO;

@Service
public class ExerciseLogicImpl implements ExerciseLogic {

    private final ExerciseDAO DAO;

    public ExerciseLogicImpl(ExerciseDAOImpl dao) {
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
            exerciseTOs.add(fromExerciseDtoToExerciseTo(exercise));
        }

        return exerciseTOs;
    }

    @Override
    public List<ExerciseO> convertListFromExercisesToExerciseOs(List<Exercise> exercises) {
        List<ExerciseO> exerciseOs = new ArrayList<ExerciseO>();

        for (Exercise exercise : exercises) {
            exerciseOs.add(fromExerciseToExerciseO(exercise));
        }

        return exerciseOs;
    }

    @Override
    public List<Exercise> convertListFromExerciseOsToExercises(List<ExerciseO> exerciseOs) {
        List<Exercise> exercises = new ArrayList<Exercise>();

        for (ExerciseO exerciseO : exerciseOs) {
            exercises.add(fromExerciseOToExercise(exerciseO));
        }
        return exercises;
    }

    private ExerciseTO fromExerciseDtoToExerciseTo(ExerciseDTO exercise) {
        return ExerciseTO.newBuilder()
                .setName(exercise.getName())
                .setDescription(exercise.getDescription())
                .setDuration(exercise.getDuration())
                .build();
    }

    private ExerciseO fromExerciseToExerciseO(Exercise exercise) {
        return ExerciseO.newBuilder()
                .setId(exercise.getId())
                .setName(exercise.getName())
                .setDescription(exercise.getDescription())
                .setDuration(exercise.getDuration())
                .build();
    }

    private Exercise fromExerciseOToExercise(ExerciseO exercise) {
        Exercise output = new Exercise();

        output.setId(exercise.getId());
        output.setName(exercise.getName());
        output.setDescription(exercise.getDescription());
        output.setDuration(exercise.getDuration());

        return output;
    }
}
