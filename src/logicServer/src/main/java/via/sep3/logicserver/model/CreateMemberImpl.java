package via.sep3.logicserver.model;

import org.springframework.stereotype.Service;

import via.sep3.logicserver.repositories.CreateMemberDAO;
import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

@Service
public class CreateMemberImpl implements CreateMemberLogic {

    private CreateMemberDAO dao;

    public CreateMemberImpl(CreateMemberDAO dao) {
        this.dao = dao;
    }

    @Override
    public Response createMember(Member member) throws Exception {

        if (member.getPassword().isEmpty() || member.getPassword().equals("")) {
            throw new Exception("Password is empty");
        }

        return dao.createMember(member);
    }

}
