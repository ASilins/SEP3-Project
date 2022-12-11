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
            ExerciseObj response = logic.createExercise(obj);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void getExercises(StringObj obj, StreamObserver<Exercises> responseObserver) {
        try {
            Exercises response = logic.getExercises();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
