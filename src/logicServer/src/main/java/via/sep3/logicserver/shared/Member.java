package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Member {

    private String userName;
    private String password;
}
