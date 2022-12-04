package via.sep3.logicserver.repositories.logic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import via.sep3.logicserver.repositories.interfaces.MemberDAO;
import via.sep3.logicserver.shared.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

    private final String URI = "https://localhost:7057/member";
    private RestTemplate restTemplate;

    public MemberDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public MemberDTO createMember(MemberDTO member) throws Exception {
        ResponseEntity<MemberDTO> responseEntity = restTemplate.postForEntity(URI + "/create", member, MemberDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCode());
        }

        return responseEntity.getBody();
    }

    @Override
    public MemberDTO loginMember(MemberDTO member) throws Exception {
        ResponseEntity<MemberDTO> responseEntity = restTemplate.postForEntity(URI + "/login", member, MemberDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCode());
        }

        return responseEntity.getBody();
    }

}
