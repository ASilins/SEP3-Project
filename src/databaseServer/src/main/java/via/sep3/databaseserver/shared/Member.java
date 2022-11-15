package via.sep3.databaseserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Member {
    private String username;
    private String password;
}
