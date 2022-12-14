package via.sep3.logicserver.model.interfaces;

import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;
import via.sep3.logicserver.protobuf.Members;

public interface MemberLogic {

    MemberObj createMember(LoginCreateObject member) throws Exception;

    MemberObj loginMember(LoginCreateObject member) throws Exception;

    MemberObj editMember(MemberObj member) throws Exception;

    Members getMembers() throws Exception;
}
