package via.sep3.logicserver.repositories.logic;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import via.sep3.logicserver.repositories.interfaces.ExerciseDAO;
import via.sep3.logicserver.shared.ExerciseDTO;

@Repository
public class ExerciseDAOImpl implements ExerciseDAO {

    private final String URI = "https://localhost:7057/exercise";
    private RestTemplate restTemplate;

    public ExerciseDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ExerciseDTO createExercise(ExerciseDTO exercise) throws Exception {
        ResponseEntity<ExerciseDTO> responseEntity = restTemplate.postForEntity(URI + "/create", exercise,
                ExerciseDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.CREATED) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCode());
        }

        return responseEntity.getBody();
    }

    @Override
    public List<ExerciseDTO> getExercises() throws Exception {
        ResponseEntity<List<ExerciseDTO>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<ExerciseDTO>>() {
                        });
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCode());
        }

        return responseEntity.getBody();
    }

}
