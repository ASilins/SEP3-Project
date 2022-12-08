package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Exercise {
    private int id;
    private String Name;
    private String Description;
    private int Duration;
}
