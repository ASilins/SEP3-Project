package via.sep3.databaseserver.repositories;

// import org.json.simple.JSONObject;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.shared.Member;
import via.sep3.databaseserver.shared.Response;

// import java.io.FileWriter;

@Repository
public class CreateMemberDAOImpl implements CreateMemberDAO {

    @Override
    public Response createMember(Member member) {

        Response response = new Response();

        System.out.println("Member: " + member + " sent to database");

        Member output = new Member();
        output.setUsername(member.getUsername());

        response.setObject(output);
        // JSONObject jsonObject = new JSONObject();

        // jsonObject.put("username", member.getUsername());
        // jsonObject.put("password", member.getPassword());

        // try {
        // FileWriter file = new FileWriter("..\\..\\..\\resources\\output.json");
        // file.write(jsonObject.toJSONString());
        // file.close();

        // response = new Response(member);
        // }
        // catch (Exception e){
        // response = new Response("Failure!");
        // e.printStackTrace();
        // }

        return response;
    }
}
