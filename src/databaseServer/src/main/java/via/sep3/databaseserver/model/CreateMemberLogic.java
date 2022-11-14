package via.sep3.databaseserver.model;

import org.springframework.stereotype.Service;
import via.sep3.databaseserver.shared.Member;
import via.sep3.databaseserver.shared.Response;


public interface CreateMemberLogic {

    public Response createMember(Member member);

}
