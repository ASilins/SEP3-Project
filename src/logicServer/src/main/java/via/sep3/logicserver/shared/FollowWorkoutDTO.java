package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FollowWorkoutDTO {
    private int userID;
    private int workoutID;
}
