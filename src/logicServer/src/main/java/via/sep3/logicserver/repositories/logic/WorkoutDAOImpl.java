package via.sep3.logicserver.repositories.logic;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.google.rpc.context.AttributeContext.Response;

import via.sep3.logicserver.repositories.interfaces.WorkoutDAO;
import via.sep3.logicserver.shared.FollowWorkoutDTO;
import via.sep3.logicserver.shared.Workout;

@Repository
public class WorkoutDAOImpl implements WorkoutDAO {

    private final String URI = "https://localhost:7057/workout";
    private RestTemplate restTemplate;

    public WorkoutDAOImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Workout getWorkout(int id) throws Exception {
        String uri = UriComponentsBuilder.fromHttpUrl(URI).queryParam("w", id).encode().toUriString();
        ResponseEntity<Workout> responseEntity = restTemplate.getForEntity(uri, Workout.class);

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public List<Workout> GetWorkouts() throws Exception {
        ResponseEntity<List<Workout>> responseEntity = restTemplate
                .exchange(URI + "s", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Workout>>() {
                        });
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public FollowWorkoutDTO assignWorkout(FollowWorkoutDTO dto) throws Exception {
        ResponseEntity<FollowWorkoutDTO> responseEntity = restTemplate
                .postForEntity(URI + "/assign", dto, FollowWorkoutDTO.class);

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Data access server error with code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public Workout editWorkout(Workout workout) throws Exception {
        // return restTemplate
        // .patchForObject(URI, workout, Workout.class);

        final HttpEntity<Workout> requestEntity = new HttpEntity<>(workout);

        ResponseEntity<Workout> responseEntity = restTemplate
                .exchange(URI, HttpMethod.PUT, requestEntity, new ParameterizedTypeReference<Workout>() {
                });

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("DAO error code: " + responseEntity.getStatusCodeValue());
        }

        return responseEntity.getBody();
    }

    @Override
    public void deleteWorkout(int id) throws Exception {
        String uri = UriComponentsBuilder.fromHttpUrl(URI).queryParam("id", id).encode().toUriString();
        restTemplate.delete(uri);
    }
}
