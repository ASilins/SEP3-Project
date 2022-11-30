package via.sep3.logicserver.repositories;

import via.sep3.logicserver.shared.MemberDTO;

public interface CreateMemberDAO {

    MemberDTO createMember(MemberDTO member) throws Exception;

    MemberDTO loginMember(MemberDTO member) throws Exception;
}
