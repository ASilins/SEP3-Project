package via.sep3.logicserver.model.logic.converters;

import org.springframework.stereotype.Service;

import com.google.protobuf.ByteString;

import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;
import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;

@Service
public class MemberConverter {

    public static LoginCreateDTO convertToLoginCreateDTO(LoginCreateObject obj) {
        LoginCreateDTO dto = new LoginCreateDTO();

        dto.setUsername(obj.getUsername());
        dto.setPassword(obj.getPassword().toByteArray());
        dto.setSalt(obj.getSalt().toByteArray());

        return dto;
    }

    public static MemberObj convertToMemberObj(MemberDTO dto) {
        return MemberObj.newBuilder()
                .setId(dto.getId())
                .setUsername(dto.getUsername())
                .setPassword(ByteString.copyFrom(dto.getPassword()))
                .setSalt(ByteString.copyFrom(dto.getSalt()))
                .setPosition(dto.getPosition())
                .build();
    }

    public static MemberDTO convertToMemberDTO(MemberObj obj) {
        MemberDTO dto = new MemberDTO();

        dto.setId(obj.getId());
        dto.setUsername(obj.getUsername());
        dto.setPassword(obj.getPassword().toByteArray());
        dto.setSalt(obj.getSalt().toByteArray());
        dto.setPosition(obj.getPosition());

        return dto;
    }
}