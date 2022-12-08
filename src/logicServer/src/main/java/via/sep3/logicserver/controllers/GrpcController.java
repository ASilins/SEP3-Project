package via.sep3.logicserver.controllers;

import java.util.List;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.model.interfaces.WorkoutLogic;
import via.sep3.logicserver.model.logic.ExerciseLogicImpl;
import via.sep3.logicserver.model.logic.MemberLogicImpl;
import via.sep3.logicserver.model.logic.WorkoutLogicImpl;
import via.sep3.logicserver.protobuf.EmptyPar;
import via.sep3.logicserver.protobuf.ExerciseTO;
import via.sep3.logicserver.protobuf.ExercisesTO;
import via.sep3.logicserver.protobuf.FollowWorkoutTO;
import via.sep3.logicserver.protobuf.MemberTO;
import via.sep3.logicserver.protobuf.ResponseMember;
import via.sep3.logicserver.protobuf.WorkoutId;
import via.sep3.logicserver.protobuf.WorkoutO;
import via.sep3.logicserver.protobuf.WorkoutsTO;
import via.sep3.logicserver.protobuf.LogicServerGrpc.LogicServerImplBase;
import via.sep3.logicserver.shared.ExerciseDTO;
import via.sep3.logicserver.shared.MemberDTO;

@GRpcService
public class GrpcController extends LogicServerImplBase {

    // This class won't be in the final production. It will be changed into multiple
    // services

    private MemberLogic memberLogic;
    private ExerciseLogic exerciseLogic;
    private WorkoutLogic workoutLogic;

    public GrpcController(MemberLogicImpl memberLogic, ExerciseLogicImpl exerciseLogic, WorkoutLogicImpl workoutLogic) {
        this.memberLogic = memberLogic;
        this.exerciseLogic = exerciseLogic;
        this.workoutLogic = workoutLogic;
    }

    // Workout

    @Override
    public void getWorkout(WorkoutId id, StreamObserver<WorkoutO> responseObserver) {
        try {
            WorkoutO response = workoutLogic.getWorkout(id.getId());

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void getWorkouts(EmptyPar par, StreamObserver<WorkoutsTO> responseObserver) {
        try {
            List<WorkoutO> workouts = workoutLogic.getWorkouts();

            WorkoutsTO response = WorkoutsTO.newBuilder()
                    .addAllWorkouts(workouts).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void assignWorkout(FollowWorkoutTO to, StreamObserver<FollowWorkoutTO> responseObserver) {
        try {
            FollowWorkoutTO response = workoutLogic.assignWorkout(to);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void editWorkout(WorkoutO workoutO, StreamObserver<WorkoutO> responseObserver) {
        try {
            WorkoutO response = workoutLogic.editWorkout(workoutO);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void deleteWorkout(WorkoutId id, StreamObserver<EmptyPar> responseObserver) {
        try {
            workoutLogic.deleteWorkout(id.getId());

            responseObserver.onNext(EmptyPar.newBuilder().setEmpty("").build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
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
