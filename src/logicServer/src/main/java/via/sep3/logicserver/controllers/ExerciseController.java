package via.sep3.logicserver.controllers;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.sep3.logicserver.model.interfaces.ExerciseLogic;
import via.sep3.logicserver.protobuf.ExerciseTO;
import via.sep3.logicserver.protobuf.LogicServerGrpc.LogicServerImplBase;
import via.sep3.logicserver.shared.ExerciseDTO;

@GRpcService
public class ExerciseController extends LogicServerImplBase {

    private ExerciseLogic logic;

    public ExerciseController(ExerciseLogic logic) {
        this.logic = logic;
    }

    @Override
    public void createExercise(ExerciseTO exercise, StreamObserver<ExerciseTO> responseObserver) {
        try {
            ExerciseDTO dto = new ExerciseDTO();
            dto.setName(exercise.getName());
            dto.setDescription(exercise.getDescription());
            dto.setDuration(exercise.getDuration());

            ExerciseDTO created = logic.createExercise(dto);

            ExerciseTO response = ExerciseTO.newBuilder().setName(created.getName())
                    .setDescription(created.getDescription()).setDuration(created.getDuration()).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
