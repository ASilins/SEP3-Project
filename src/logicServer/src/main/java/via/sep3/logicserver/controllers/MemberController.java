package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.model.logic.MemberLogicImpl;
import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;
import via.sep3.logicserver.protobuf.MemberServiceGrpc.MemberServiceImplBase;
import via.sep3.logicserver.protobuf.StringObj;

@GRpcService
public class MemberController extends MemberServiceImplBase {

    private MemberLogic logic;

    public MemberController(MemberLogicImpl logic) {
        this.logic = logic;
    }

    @Override
    public void createMember(LoginCreateObject obj, StreamObserver<MemberObj> responseObserver) {
        try {
            MemberObj response = logic.createMember(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void loginMember(LoginCreateObject obj, StreamObserver<MemberObj> responseObserver) {
        try {
            MemberObj response = logic.loginMember(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void editPrivilege(MemberObj obj, StreamObserver<StringObj> responseObserver) {
        try {
            MemberObj response = logic.editPrivilege(obj);

            responseObserver.onNext(StringObj.newBuilder().setName("").build());
            responseObserver.onCompleted();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
