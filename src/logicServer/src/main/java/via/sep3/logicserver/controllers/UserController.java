package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;
import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.CreateMemberImpl;
import via.sep3.logicserver.model.CreateMemberLogic;
import via.sep3.logicserver.protobuf.CreatedMember;
import via.sep3.logicserver.protobuf.ResponseMember;
import via.sep3.logicserver.protobuf.LogicServerGrpc.LogicServerImplBase;
import via.sep3.logicserver.shared.Member;

@GRpcService
public class UserController extends LogicServerImplBase {

    private CreateMemberLogic logic;

    public UserController(CreateMemberImpl logic) {
        this.logic = logic;
    }

    @Override
    public void createMember(CreatedMember member, StreamObserver<ResponseMember> responseObserver) {

        try {
            Member memberToCreate = new Member();
            memberToCreate.setUsername(member.getUsername());
            memberToCreate.setPassword(member.getPassword());
            Member createdMember = ((Member) logic.createMember(memberToCreate).getObject());
            ResponseMember response = ResponseMember.newBuilder()
                    .setUsername((createdMember).getUsername()).build();
            // ResponseMember response = ResponseMember.newBuilder()
            // .setUsername("Username").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
