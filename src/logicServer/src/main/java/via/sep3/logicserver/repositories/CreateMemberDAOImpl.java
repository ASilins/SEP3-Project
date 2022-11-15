package via.sep3.logicserver.repositories;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

        ResponseEntity<Member> responseEntity = restTemplate.postForEntity(URI, member, Member.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCode());
        }

        response.setObject(responseEntity.getBody());

        return response;
    }

}
