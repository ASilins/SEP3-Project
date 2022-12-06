package via.sep3.logicserver.shared;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Workout {
    private int id;
    private String name;
    private String description;
    private int durationInMin;
    private int createdBy;
    private int followedBy;
    private boolean isPublic;
    private List<Exercise> exercises;

    public int numberOfExercises() {
        return exercises.size();
    }
}
