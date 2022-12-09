package via.sep3.logicserver.model.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.logic.converters.ExerciseConverter;
import via.sep3.logicserver.protobuf.ExerciseObj;
import via.sep3.logicserver.protobuf.Exercises;
import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.repositories.logic.ExerciseDAOImpl;

@Service
public class ExerciseLogicImpl implements ExerciseLogic {

    private final ExerciseDAO DAO;

    @Autowired
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
}