package via.sep3.logicserver.model.logic.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.protobuf.ByteString;

import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;
import via.sep3.logicserver.protobuf.Members;
import via.sep3.logicserver.shared.Login;
import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;

import java.util.List;

@Service
public class MemberConverter {

    public static LoginCreateDTO convertToLoginCreateDTO(LoginCreateObject obj) {
        LoginCreateDTO dto = new LoginCreateDTO();

        dto.setUsername(obj.getUsername());
        dto.setPassword(obj.getPassword().toByteArray());
        dto.setSalt(obj.getSalt().toByteArray());

        return dto;
    }

    public static Login convertToLogin(LoginCreateObject obj) {
        Login dto = new Login();

        dto.setUsername(obj.getUsername());

        return dto;
    }

    public static MemberObj convertToMemberObj(MemberDTO dto) {
        if (dto.getPassword() == null && dto.getSalt() == null) {
            byte[] temp = {};
            dto.setPassword(temp);
            dto.setSalt(temp);
            ;
        }
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


    public static List<MemberObj> convertToMemberObjList(List<MemberDTO> dtoList) {
        List<MemberObj> objList = new ArrayList<MemberObj>();

        for (MemberDTO dto : dtoList) {
            objList.add(convertToMemberObj(dto));
        }

        return objList;
    }


    public static Members convertToMembers(List<MemberObj> memberObjs){
        return Members.newBuilder()
                .addAllMembers(memberObjs)
                .build();
    }

}
