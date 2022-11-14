package via.sep3.logicserver.repositories;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

@Repository
public class CreateMemberDAOImpl implements CreateMemberDAO {

    private final String URI = "http://localhost:4567/create-member/member";
    private RestTemplate restTemplate;

    public CreateMemberDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response createMember(Member member) throws Exception {
        Response response = new Response();

        response.setObject(restTemplate.postForObject(URI, member, User.class));

        return response;
    }

}
