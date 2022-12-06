package via.sep3.logicserver.repositories.interfaces;

import via.sep3.logicserver.shared.MemberDTO;

public interface MemberDAO {

    MemberDTO createMember(MemberDTO member) throws Exception;

    MemberDTO loginMember(MemberDTO member) throws Exception;
}
