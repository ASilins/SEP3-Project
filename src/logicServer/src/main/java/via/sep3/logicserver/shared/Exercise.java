package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Exercise {
    private int id;
    private String name;
    private String description;
    private int duration;
}
