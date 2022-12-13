package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.model.logic.ExerciseLogicImpl;
import via.sep3.logicserver.protobuf.ExerciseObj;
import via.sep3.logicserver.protobuf.Exercises;
import via.sep3.logicserver.protobuf.StringObj;
import via.sep3.logicserver.protobuf.ExerciseServiceGrpc.ExerciseServiceImplBase;
import via.sep3.logicserver.shared.Logger.Logger;

@GRpcService
public class ExerciseController extends ExerciseServiceImplBase {

    private ExerciseLogic logic;

    @Autowired
    public ExerciseController(ExerciseLogicImpl logic) {
        this.logic = logic;
    }

    @Override
    public void createExercise(ExerciseObj obj, StreamObserver<ExerciseObj> responseObserver) {
        try {
            Logger.writeLog("<Received createExercise request>", "info");

            ExerciseObj response = logic.createExercise(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--CreateExercise request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in ExerciseController>>");
            responseObserver.onError(e);
        }
    }

    @Override
    public void getExercises(StringObj obj, StreamObserver<Exercises> responseObserver) {
        try {
            Logger.writeLog("<Received getExercises request>", "info");

            Exercises response = logic.getExercises();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            Logger.writeLog("--GetExercises request successful--", "info");
        } catch (Exception e) {
            Logger.writeLog("Exception " + e.toString(), "error");
            System.out.println("<<Exception in ExerciseController>>");
            responseObserver.onError(e);
        }
    }
}
