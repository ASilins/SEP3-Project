package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.model.logic.MemberLogicImpl;
import via.sep3.logicserver.protobuf.IntObj;
import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;
import via.sep3.logicserver.protobuf.Members;
import via.sep3.logicserver.protobuf.MemberServiceGrpc.MemberServiceImplBase;
import via.sep3.logicserver.shared.Logger.Logger;
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
            Logger.writeLog("<Received createMember request>", "info");

            MemberObj response = logic.createMember(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--CreateMember request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in MemberController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void loginMember(LoginCreateObject obj, StreamObserver<MemberObj> responseObserver) {
        try {
            Logger.writeLog("<Received loginMember request>", "info");

            MemberObj response = logic.loginMember(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--LoginMember request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in MemberController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void editMember(MemberObj obj, StreamObserver<StringObj> responseObserver) {
        try {
            Logger.writeLog("<Received editMember request>", "info");

            logic.editMember(obj);

            responseObserver.onNext(StringObj.newBuilder().setName("").build());
            responseObserver.onCompleted();

            Logger.writeLog("--EditPrivilege request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in MemberController>>");
            responseObserver.onError(e);
        }
    }

    @Override

    public void getMembers(StringObj obj, StreamObserver<Members> responseObserver) {
        try {
            Logger.writeLog("<Received getMembers reqeust>", "info");

            Members response = logic.getMembers();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--GetMembers request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
        }
    }
    @Override
    public void deleteMember(IntObj obj, StreamObserver<StringObj> responseObserver){
        try {
            Logger.writeLog("<Received deleteWorkout request>", "info");

            logic.deleteMember(obj.getNumber());

            responseObserver.onNext(StringObj.newBuilder().setName("").build());
            responseObserver.onCompleted();

            Logger.writeLog("--deleteMember request SUCCESSFUL--", "info");
        } catch (Exception e){

            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in MemberController>>");
            responseObserver.onError(e);
        }
    }

}
