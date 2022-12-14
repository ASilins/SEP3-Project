package via.sep3.logicserver.repositories.logic;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import via.sep3.logicserver.repositories.interfaces.MemberDAO;
import via.sep3.logicserver.shared.Login;
import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;
import via.sep3.logicserver.shared.Exceptions.DAOException;
import via.sep3.logicserver.shared.Logger.Logger;

import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {

    private final String URI = "https://localhost:7057/api/member";
    private RestTemplate restTemplate;

    public MemberDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public MemberDTO createMember(LoginCreateDTO obj) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<MemberDTO> responseEntity = restTemplate
                .postForEntity(URI + "/create", obj, MemberDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new DAOException("Data access server error with code: " +
                    responseEntity.getStatusCodeValue());
        }
        return responseEntity.getBody();
    }

    @Override
    public MemberDTO getByUsername(Login obj) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<MemberDTO> responseEntity = restTemplate
                .postForEntity(URI + "/login", obj, MemberDTO.class);

        if (responseEntity.getStatusCode() == HttpStatus.NOT_FOUND) {
            return null;
        }

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public MemberDTO getById(int id) throws Exception {
        ResponseEntity<MemberDTO> responseEntity = restTemplate
                .postForEntity(URI + "/login", id, MemberDTO.class);

        if (responseEntity.getStatusCode() == HttpStatus.NOT_FOUND) {
            return null;
        }

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Date access server error with code " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public void editMember(MemberDTO member) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        final HttpEntity<MemberDTO> requestEntity = new HttpEntity<>(member);
        ResponseEntity<MemberDTO> responseEntity = restTemplate
                .exchange(URI, HttpMethod.PUT, requestEntity, new ParameterizedTypeReference<MemberDTO>() {
                });

        if (responseEntity.getStatusCode() != HttpStatus.NO_CONTENT) {
            throw new DAOException("DAO error code:" + responseEntity.getStatusCodeValue());
        }
    }

    @Override
    public List<MemberDTO> getMembers() throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<List<MemberDTO>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<MemberDTO>>() {
                        });
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public void deleteMember(int id) throws Exception {
        String uri = UriComponentsBuilder.fromHttpUrl(URI).queryParam("id", id).encode().toUriString();
        restTemplate.delete(uri);
    }

}
