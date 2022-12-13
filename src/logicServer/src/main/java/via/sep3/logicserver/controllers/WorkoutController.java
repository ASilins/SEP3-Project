package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.WorkoutLogic;
import via.sep3.logicserver.model.logic.WorkoutLogicImpl;
import via.sep3.logicserver.protobuf.AssignWorkoutObj;
import via.sep3.logicserver.protobuf.IntObj;
import via.sep3.logicserver.protobuf.StringObj;
import via.sep3.logicserver.protobuf.WorkoutObj;
import via.sep3.logicserver.protobuf.Workouts;
import via.sep3.logicserver.protobuf.WorkoutServiceGrpc.WorkoutServiceImplBase;
import via.sep3.logicserver.shared.Logger.Logger;

@GRpcService
public class WorkoutController extends WorkoutServiceImplBase {

    private WorkoutLogic logic;

    public WorkoutController(WorkoutLogicImpl logic) {
        this.logic = logic;
    }

    @Override
    public void getWorkout(IntObj obj, StreamObserver<WorkoutObj> responseObserver) {
        try {
            Logger.writeLog("<Received getWorkout request>", "info");

            WorkoutObj response = logic.getWorkout(obj.getNumber());

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--GetWorkout request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in WorkoutController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void getWorkouts(StringObj obj, StreamObserver<Workouts> responseObserver) {
        try {
            Logger.writeLog("<Received getWorkouts request>", "info");

            Workouts response = logic.getWorkouts();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--GetWorkouts request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in WorkoutController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void editWorkout(WorkoutObj obj, StreamObserver<StringObj> responseObserver) {
        try {
            Logger.writeLog("<Received editWorkout request>", "info");

            // Need to modify
            WorkoutObj response = logic.editWorkout(obj);

            responseObserver.onNext(StringObj.newBuilder().setName("").build());
            responseObserver.onCompleted();

            Logger.writeLog("--EditWorkout request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in WorkoutController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void deleteWorkout(IntObj obj, StreamObserver<StringObj> responseObserver) {
        try {
            Logger.writeLog("<Received deleteWorkout request>", "info");

            logic.deleteWorkout(obj.getNumber());

            responseObserver.onNext(StringObj.newBuilder().setName("").build());
            responseObserver.onCompleted();

            Logger.writeLog("--DeleteWorkout request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in WorkoutController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void assignWorkout(AssignWorkoutObj obj, StreamObserver<AssignWorkoutObj> responseObserver) {
        try {
            Logger.writeLog("<Received assignWorkout request>", "info");

            AssignWorkoutObj response = logic.assignWorkout(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--AssignWorkout request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in WorkoutController>>");
            responseObserver.onError(e);
        }
    }
}
