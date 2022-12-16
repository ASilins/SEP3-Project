package via.sep3.logicserver.repositories.interfaces;

import via.sep3.logicserver.shared.Login;
import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;

import java.util.List;

public interface MemberDAO {

    MemberDTO createMember(LoginCreateDTO member) throws Exception;

    MemberDTO getByUsername(Login member) throws Exception;

    MemberDTO getById(int id) throws Exception;

    void editMember(MemberDTO member) throws Exception;

    List<MemberDTO> getMembers() throws Exception;

    void deleteMember(int id) throws Exception;
}
