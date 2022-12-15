package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ExercisesInWorkouts {
    private int exerciseId;
    private int workoutId;
}
