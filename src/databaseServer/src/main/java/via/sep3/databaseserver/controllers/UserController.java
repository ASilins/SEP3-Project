package via.sep3.databaseserver.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.databaseserver.model.CreateMemberLogic;
import via.sep3.databaseserver.shared.Member;
import via.sep3.databaseserver.shared.Response;

@RestController
@RequestMapping("/create-member")
public class UserController {

    private CreateMemberLogic logic;

    public UserController(CreateMemberLogic logic) {
        this.logic = logic;
    }

    @PostMapping("/member")
    public ResponseEntity<Object> createMember(@RequestBody Member member) {

        Response response = new Response();

        try {
            response = logic.createMember(member);
            return new ResponseEntity<>(response.getObject(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }

    }

}
