package via.sep3.logicserver.model.logic.converters;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import via.sep3.logicserver.protobuf.ExerciseObj;
import via.sep3.logicserver.protobuf.Exercises;
import via.sep3.logicserver.shared.ExerciseDTO;

@Service
public class ExerciseConverter {
    public static ExerciseDTO convertToExerciseDTO(ExerciseObj obj) {
        ExerciseDTO dto = new ExerciseDTO();

        dto.setId(obj.getId());
        dto.setName(obj.getName());
        dto.setDescription(obj.getDescription());
        dto.setDuration(obj.getDuration());

        return dto;
    }

    public static ExerciseObj convertToExerciseObj(ExerciseDTO dto) {
        return ExerciseObj.newBuilder()
                .setId(dto.getId())
                .setName(dto.getName())
                .setDescription(dto.getDescription())
                .setDuration(dto.getDuration())
                .build();
    }

    public static Exercises convertToExercises(List<ExerciseObj> objList) {
        return Exercises.newBuilder()
                .addAllExercises(objList)
                .build();
    }

    public static List<ExerciseDTO> convertToExerciseDTOList(List<ExerciseObj> objList) {
        List<ExerciseDTO> dtoList = new ArrayList<ExerciseDTO>();

        for (ExerciseObj obj : objList) {
            dtoList.add(convertToExerciseDTO(obj));
        }

        return dtoList;
    }

    public static List<ExerciseObj> convertToExerciseObjList(List<ExerciseDTO> dtoList) {
        List<ExerciseObj> objList = new ArrayList<ExerciseObj>();

        for (ExerciseDTO dto : dtoList) {
            objList.add(convertToExerciseObj(dto));
        }

        return objList;
    }
}
