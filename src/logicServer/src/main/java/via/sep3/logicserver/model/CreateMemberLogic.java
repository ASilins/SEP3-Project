package via.sep3.logicserver.model;

import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

public interface CreateMemberLogic {
    Response createMember(Member member) throws Exception;
}
