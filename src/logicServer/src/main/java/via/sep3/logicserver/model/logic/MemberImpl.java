package via.sep3.logicserver.model.logic;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.repositories.interfaces.MemberDAO;
import via.sep3.logicserver.repositories.logic.MemberDAOImpl;
import via.sep3.logicserver.shared.MemberDTO;

@Service
public class MemberImpl implements MemberLogic {

    private MemberDAO dao;

    public MemberImpl(MemberDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public MemberDTO createMember(MemberDTO member) throws Exception {
        return dao.createMember(member);
    }

    @Override
    public MemberDTO loginMember(MemberDTO member) throws Exception {
        MemberDTO search = dao.loginMember(member);

        if (search == null) {
            throw new Exception("User not found");
        }

        if (search.getPassword().equals(member.getPassword())) {
            return member;
        } else {
            throw new Exception("Incorrect password");
        }
    }

}
