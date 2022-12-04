package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;
import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.model.logic.MemberImpl;
import via.sep3.logicserver.protobuf.MemberTO;
import via.sep3.logicserver.protobuf.ResponseMember;
import via.sep3.logicserver.protobuf.LogicServerGrpc.LogicServerImplBase;
import via.sep3.logicserver.shared.MemberDTO;

@GRpcService
public class MemberController extends LogicServerImplBase {

    private MemberLogic logic;

    public MemberController(MemberImpl logic) {
        this.logic = logic;
    }

    @Override
    public void createMember(MemberTO member, StreamObserver<ResponseMember> responseObserver) {
        try {
            // Logic setup
            MemberDTO memberToCreate = new MemberDTO();
            memberToCreate.setUsername(member.getUsername());
            memberToCreate.setPassword(member.getPassword());

            // Call to logic
            MemberDTO createdMember = logic.createMember(memberToCreate);

            // Response setup
            ResponseMember response = ResponseMember.newBuilder()
                    .setUsername((createdMember).getUsername()).build();

            // Response
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void loginMember(MemberTO member, StreamObserver<ResponseMember> responseObserver) {
        try {
            MemberDTO memberToLogin = new MemberDTO();
            memberToLogin.setUsername(member.getUsername());
            memberToLogin.setPassword(member.getPassword());

            MemberDTO loggedInMember = logic.loginMember(memberToLogin);

            ResponseMember response = ResponseMember.newBuilder()
                    .setUsername((loggedInMember).getUsername()).build();

            // Response
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
