package via.sep3.logicserver.shared;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Workout {
    private int id;
    private String Name;
    private String Description;
    private int DurationInMin;
    private int CreatedBy;
    private int FollowedBy;
    private boolean isPublic;
    private List<Exercise> Exercises;

    public int numberOfExercises() {
        return Exercises.size();
    }
}
