package via.sep3.logicserver.repositories;

import org.springframework.stereotype.Repository;

import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

@Repository
public interface CreateMemberDAO {
    Response createMember(Member member) throws Exception;
}
