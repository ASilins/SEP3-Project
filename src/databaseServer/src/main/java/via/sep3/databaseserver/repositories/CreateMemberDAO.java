package via.sep3.databaseserver.repositories;

import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.shared.Member;
import via.sep3.databaseserver.shared.Response;


public interface CreateMemberDAO {
    public Response createMember(Member member);
}
