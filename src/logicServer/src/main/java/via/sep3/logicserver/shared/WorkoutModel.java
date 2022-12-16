package via.sep3.logicserver.shared;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class WorkoutModel {
    private int id;
    private String name;
    private String description;
    private int durationInMin;
    private int createdBy;
    private boolean isPublic;
    private List<ExercisesInWorkouts> exercises;
    private List<FollowWorkoutDTO> followers;

    public int numberOfExercises() {
        return exercises.size();
    }
}
