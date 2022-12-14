package via.sep3.logicserver.model.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.logic.converters.ExerciseConverter;
import via.sep3.logicserver.protobuf.ExerciseObj;
import via.sep3.logicserver.protobuf.Exercises;
import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.repositories.logic.ExerciseDAOImpl;
import via.sep3.logicserver.shared.ExerciseDTO;

@Service
public class ExerciseLogicImpl implements ExerciseLogic {

    private final ExerciseDAO DAO;

    public ExerciseLogicImpl(ExerciseDAOImpl dao) {
        DAO = dao;
    }

    @Override
    public ExerciseObj createExercise(ExerciseObj obj) throws Exception {
        return ExerciseConverter.convertToExerciseObj(
                DAO.createExercise(ExerciseConverter.convertToExerciseDTO(obj)));
    }

    @Override
    public Exercises getExercises() throws Exception {
        return ExerciseConverter.convertToExercises(
                ExerciseConverter.convertToExerciseObjList(DAO.getExercises()));
    }

    @Override
    public void editExercise(ExerciseObj obj) throws Exception {
        DAO.editExercise(
                ExerciseConverter.convertToExerciseDTO(obj));
    }

    @Override
    public void deleteExercise(int id) throws Exception {
        DAO.deleteExercise(id);
    }
}