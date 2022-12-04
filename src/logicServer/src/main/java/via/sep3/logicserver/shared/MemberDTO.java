package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MemberDTO {

    private String username;
    private String password;
}
