package via.sep3.logicserver.model;

import via.sep3.logicserver.repositories.CreateMemberDAO;
import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

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
