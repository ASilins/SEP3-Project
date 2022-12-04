package via.sep3.logicserver.model.interfaces;

import via.sep3.logicserver.shared.MemberDTO;

public interface MemberLogic {

    MemberDTO createMember(MemberDTO member) throws Exception;

    MemberDTO loginMember(MemberDTO member) throws Exception;
}
