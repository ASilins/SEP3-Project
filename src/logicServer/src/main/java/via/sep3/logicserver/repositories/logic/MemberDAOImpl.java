package via.sep3.logicserver.repositories.logic;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import via.sep3.logicserver.repositories.interfaces.MemberDAO;
import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;

import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {

    private final String URI = "https://localhost:7057/member";
    private RestTemplate restTemplate;

    public MemberDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public MemberDTO createMember(LoginCreateDTO obj) throws Exception {
        ResponseEntity<MemberDTO> responseEntity = restTemplate.postForEntity(URI + "/create", obj, MemberDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public MemberDTO getByUsername(LoginCreateDTO obj) throws Exception {
        ResponseEntity<MemberDTO> responseEntity = restTemplate.postForEntity(URI + "/login", obj, MemberDTO.class);

        if (responseEntity.getStatusCode() == HttpStatus.NOT_FOUND) {
            return null;
        }

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public MemberDTO editPrivilege(MemberDTO member) throws Exception {
        final HttpEntity<MemberDTO> requestEntity = new HttpEntity<>(member);
        ResponseEntity<MemberDTO> responseEntity = restTemplate
                .exchange(URI, HttpMethod.PUT, requestEntity, new ParameterizedTypeReference<MemberDTO>() {
                });

        if (responseEntity.getStatusCode() != HttpStatus.OK){
            throw new Exception("DAO error code:" + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public List<MemberDTO> getMembers() throws Exception {
        ResponseEntity<List<MemberDTO>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<MemberDTO>>() {
                            });
        if (responseEntity.getStatusCode() != HttpStatus.OK){
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

}
