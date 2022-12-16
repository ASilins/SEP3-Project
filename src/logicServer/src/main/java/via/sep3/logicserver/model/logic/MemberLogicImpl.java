package via.sep3.logicserver.model.logic;

import org.springframework.stereotype.Service;
import via.sep3.logicserver.model.interfaces.MemberLogic;
import via.sep3.logicserver.model.logic.converters.MemberConverter;
import via.sep3.logicserver.protobuf.LoginCreateObject;
import via.sep3.logicserver.protobuf.MemberObj;
import via.sep3.logicserver.protobuf.Members;
import via.sep3.logicserver.repositories.interfaces.MemberDAO;
import via.sep3.logicserver.repositories.logic.MemberDAOImpl;
import via.sep3.logicserver.shared.LoginCreateDTO;
import via.sep3.logicserver.shared.MemberDTO;

@Service
public class MemberLogicImpl implements MemberLogic {

    private MemberDAO dao;

    public MemberLogicImpl(MemberDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    public MemberObj createMember(LoginCreateObject obj) throws Exception {
        LoginCreateDTO dto = MemberConverter.convertToLoginCreateDTO(obj);

        return MemberConverter.convertToMemberObj(dao.createMember(dto));
    }

    @Override
    public MemberObj loginMember(LoginCreateObject obj) throws Exception {
        MemberDTO search = dao.getByUsername(MemberConverter.convertToLogin(obj));

        if (search == null) {
            throw new Exception("User not found");
        }

        return MemberConverter.convertToMemberObj(search);
    }

    @Override
    public MemberObj editMember(MemberObj member) throws Exception {
        return MemberConverter.convertToMemberObj(
                dao.editMember(MemberConverter.convertToMemberDTO(member)));
    }

    @Override
    public Members getMembers() throws Exception {
        return MemberConverter.convertToMembers(
                MemberConverter.convertToMemberObjList(dao.getMembers()));
    }

    @Override
    public void deleteMember(int id) throws Exception {
        dao.deleteMember(id);
    }
}
