package via.sep3.logicserver.model;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.repositories.CreateMemberDAO;
import via.sep3.logicserver.shared.MemberDTO;

@Service
public class CreateMemberImpl implements CreateMemberLogic {

    private CreateMemberDAO dao;

    public CreateMemberImpl(CreateMemberDAO dao) {
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
