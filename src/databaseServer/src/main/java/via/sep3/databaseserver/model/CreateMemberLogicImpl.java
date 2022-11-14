package via.sep3.databaseserver.model;

import org.springframework.stereotype.Service;
import via.sep3.databaseserver.repositories.CreateMemberDAO;
import via.sep3.databaseserver.shared.Member;
import via.sep3.databaseserver.shared.Response;

@Service
public class CreateMemberLogicImpl implements CreateMemberLogic{

    private CreateMemberDAO dao;

    public CreateMemberLogicImpl(CreateMemberDAO dao){
        this.dao = dao;
    }

    @Override
    public Response createMember(Member member) {

        Response response = new Response();

        try {
            response = dao.createMember(member);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return response;

    }
}
