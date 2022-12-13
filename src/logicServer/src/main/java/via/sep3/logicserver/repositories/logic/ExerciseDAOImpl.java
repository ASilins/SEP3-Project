package via.sep3.logicserver.repositories.logic;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.shared.ExerciseDTO;
import via.sep3.logicserver.shared.Exceptions.DAOException;
import via.sep3.logicserver.shared.Logger.Logger;

@Service
public class ExerciseDAOImpl implements ExerciseDAO {

    private final String URI = "https://localhost:7057/exercise";
    private RestTemplate restTemplate;

    public ExerciseDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<ExerciseDTO> responseEntity = restTemplate.postForEntity(URI + "/create", exercise,
                ExerciseDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public List<ExerciseDTO> getExercises() throws Exception {
        Logger.writeLog("Sending request to DAO Server", "info");
        ResponseEntity<List<ExerciseDTO>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<ExerciseDTO>>() {
                        });
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new DAOException("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

}
