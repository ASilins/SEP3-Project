package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
// In new build
public class MemberDTO {
    private int id;
    private String username;
    private String password;
    private String position;
}
