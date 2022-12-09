package via.sep3.logicserver.model.interfaces;

import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;

public interface MemberLogic {

    MemberObj createMember(LoginCreateObject member) throws Exception;

    MemberObj loginMember(LoginCreateObject member) throws Exception;
}
