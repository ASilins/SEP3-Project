package via.sep3.logicserver.model;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

@Service
public interface CreateMemberLogic {
    Response createMember(Member member) throws Exception;
}
