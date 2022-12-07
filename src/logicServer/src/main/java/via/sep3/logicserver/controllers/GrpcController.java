package via.sep3.logicserver.controllers;

import java.util.List;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.model.logic.ExerciseImpl;
import via.sep3.logicserver.model.logic.MemberImpl;
import via.sep3.logicserver.protobuf.EmptyPar;
import via.sep3.logicserver.protobuf.ExerciseTO;
import via.sep3.logicserver.protobuf.ExercisesTO;
import via.sep3.logicserver.protobuf.MemberTO;
import via.sep3.logicserver.protobuf.ResponseMember;
import via.sep3.logicserver.protobuf.LogicServerGrpc.LogicServerImplBase;
import via.sep3.logicserver.shared.ExerciseDTO;
import via.sep3.logicserver.shared.MemberDTO;

@GRpcService
public class GrpcController extends LogicServerImplBase {

    private MemberLogic memberLogic;
    private ExerciseLogic exerciseLogic;

    public GrpcController(MemberImpl memberLogic, ExerciseImpl exerciseLogic) {
        this.memberLogic = memberLogic;
        this.exerciseLogic = exerciseLogic;
    }

    // Exercise

    @Override
    public void createExercise(ExerciseTO exercise, StreamObserver<ExerciseTO> responseObserver) {
        try {
            ExerciseDTO dto = new ExerciseDTO();
            dto.setName(exercise.getName());
            dto.setDescription(exercise.getDescription());
            dto.setDuration(exercise.getDuration());

            ExerciseDTO created = exerciseLogic.createExercise(dto);

            ExerciseTO response = ExerciseTO.newBuilder().setName(created.getName())
                    .setDescription(created.getDescription()).setDuration(created.getDuration()).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void getExercises(EmptyPar par, StreamObserver<ExercisesTO> responseObserver) {
        try {
            List<ExerciseTO> exercises = exerciseLogic.getExercises();

            ExercisesTO response = ExercisesTO.newBuilder()
                    .addAllExercises(exercises)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    // Member

    @Override
    public void createMember(MemberTO member, StreamObserver<ResponseMember> responseObserver) {
        try {
            // Logic setup
            MemberDTO memberToCreate = new MemberDTO();
            memberToCreate.setUsername(member.getUsername());
            memberToCreate.setPassword(member.getPassword());

            // Call to logic
            MemberDTO createdMember = memberLogic.createMember(memberToCreate);

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

            MemberDTO loggedInMember = memberLogic.loginMember(memberToLogin);

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
