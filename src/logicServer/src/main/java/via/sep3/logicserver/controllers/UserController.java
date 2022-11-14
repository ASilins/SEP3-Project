package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.netty.shaded.io.netty.handler.ssl.SupportedCipherSuiteFilter;
import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.CreateMemberLogic;
import via.sep3.logicserver.protobuf.CreatedMember;
import via.sep3.logicserver.protobuf.ResponseMember;
import via.sep3.logicserver.protobuf.LogicServerGrpc.LogicServerImplBase;
import via.sep3.logicserver.shared.Member;
import via.sep3.logicserver.shared.Response;

@GRpcService
public class UserController extends LogicServerImplBase {

    private CreateMemberLogic logic;

    public UserController(CreateMemberLogic logic) {
        this.logic = logic;
    }

    @Override
    public void createMember(CreatedMember member, StreamObserver<ResponseMember> responseObserver) {

        try {
            Member memberToCreate = new Member();
            memberToCreate.setUserName(member.getUsername());
            memberToCreate.setPassword(member.getPassword());
            Response createdMember = logic.createMember(memberToCreate);
            ResponseMember response = ResponseMember.newBuilder()
                    .setUsername(((Member) createdMember.getObject()).getUserName()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
