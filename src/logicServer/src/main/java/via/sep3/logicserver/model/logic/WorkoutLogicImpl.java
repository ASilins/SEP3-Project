package via.sep3.logicserver.model.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import via.sep3.logicserver.model.interfaces.WorkoutLogic;
import via.sep3.logicserver.model.logic.converters.WorkoutConverter;
import via.sep3.logicserver.protobuf.AssignWorkoutObj;
import via.sep3.logicserver.protobuf.WorkoutObj;
import via.sep3.logicserver.protobuf.Workouts;
import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.repositories.interfaces.MemberDAO;
import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.repositories.logic.WorkoutDAOImpl;
import via.sep3.logicserver.shared.ExerciseDTO;
import via.sep3.logicserver.shared.ExercisesInWorkouts;
import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.WorkoutModel;
import via.sep3.logicserver.shared.WorkoutDTO;

@Service
public class WorkoutLogicImpl implements WorkoutLogic {

    private WorkoutDAO dao;
    private ExerciseDAO exerciseDAO;

    public WorkoutLogicImpl(WorkoutDAOImpl dao, ExerciseDAO exerciseDAO) {
        this.dao = dao;
        this.exerciseDAO = exerciseDAO;
    }

    @Override
    public WorkoutObj getWorkout(int id) throws Exception {
        WorkoutModel workout = dao.getWorkout(id);
        List<ExerciseDTO> exercises = new ArrayList<ExerciseDTO>();

        if (workout.getExercises() != null)
            for (ExercisesInWorkouts exercise : workout.getExercises()) {
                exercises.add(exerciseDAO.getExercise(exercise.getExerciseId()));
            }

        return WorkoutConverter.convertToWorkoutObj(
                WorkoutConverter.convertToWorkoutDTO(workout, exercises));
    }

    @Override
    public Workouts getWorkouts(int id) throws Exception {
        List<WorkoutModel> workouts = dao.GetWorkouts();
        List<WorkoutDTO> dtos = new ArrayList<>();

        for (WorkoutModel workout : workouts) {

            List<ExerciseDTO> exercises = new ArrayList<ExerciseDTO>();

            for (ExercisesInWorkouts exercise : workout.getExercises()) {
                exercises.add(exerciseDAO.getExercise(exercise.getExerciseId()));
            }

            dtos.add(WorkoutConverter
                    .convertToWorkoutDTO(workout, exercises));
        }

        if (id == 0) {
            // Maybe add after
            // for (WorkoutDTO workoutDTO : dtos) {
            // if (!workoutDTO.isPublic())
            // dtos.remove(workoutDTO);
            // }

            return WorkoutConverter.convertToWorkouts(
                    WorkoutConverter.convertToWorkoutObjList(dtos));
        }

        for (WorkoutDTO workoutDTO : dtos) {
            FollowWorkoutDTO temp = new FollowWorkoutDTO();
            temp.setUserID(id);
            temp.setWorkoutID(workoutDTO.getId());

            if (!workoutDTO.getFollowers().contains(temp) || workoutDTO.getCreatedBy() != id)
                dtos.remove(workoutDTO);
        }

        return WorkoutConverter.convertToWorkouts(
                WorkoutConverter.convertToWorkoutObjList(dtos));
    }

    @Override
    public AssignWorkoutObj assignWorkout(AssignWorkoutObj dto) throws Exception {
        return WorkoutConverter.convertToAssignWorkoutTO(
                dao.assignWorkout(
                        WorkoutConverter.convertToFollowWorkoutDTO(dto)));
    }

    @Override
    public void editWorkout(WorkoutObj workout) throws Exception {
        List<ExercisesInWorkouts> exercises = new ArrayList<>();
        WorkoutDTO dto = WorkoutConverter.convertToWorkoutDTO(workout);

        for (ExerciseDTO exerciseDTO : dto.getExercises()) {
            ExercisesInWorkouts temp = new ExercisesInWorkouts();

            temp.setExerciseId(exerciseDTO.getId());
            temp.setWorkoutId(dto.getId());

            exercises.add(temp);
        }
        dao.editWorkout(WorkoutConverter
                .convertToWorkout(dto, exercises));
    }

    @Override
    public void deleteWorkout(int id) throws Exception {
        dao.deleteWorkout(id);
    }

    @Override
    public WorkoutObj createWorkout(WorkoutObj workoutObj) throws Exception {
        return WorkoutConverter.convertToWorkoutObj(
                dao.createWorkout(WorkoutConverter.convertToWorkoutDTO(workoutObj)));
    }
}
