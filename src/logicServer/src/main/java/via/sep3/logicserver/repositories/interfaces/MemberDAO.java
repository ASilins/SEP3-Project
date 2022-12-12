package via.sep3.logicserver.repositories.interfaces;

import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;

import java.util.List;

public interface MemberDAO {

    MemberDTO createMember(LoginCreateDTO member) throws Exception;

    MemberDTO getByUsername(LoginCreateDTO member) throws Exception;

    MemberDTO editPrivilege(MemberDTO member) throws Exception;
    List<MemberDTO> getMembers() throws Exception;
}
