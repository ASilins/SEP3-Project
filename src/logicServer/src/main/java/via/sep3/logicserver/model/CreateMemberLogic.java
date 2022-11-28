package via.sep3.logicserver.model;

import via.sep3.logicserver.shared.MemberDTO;

public interface CreateMemberLogic {

    MemberDTO createMember(MemberDTO member) throws Exception;

    MemberDTO loginMember(MemberDTO member) throws Exception;
}
