package egovframework.com.studentMng.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("StudentMngDAO")
public class StudentMngDAO extends EgovAbstractMapper{

	public List<HashMap<String, Object>> selectStudentMngList() {
		return selectList("selectStudentlMngList");
	}

	public HashMap<String, Object> selectStudentMngInfo(int studentId) {
		return selectOne("selectStudentMngInfo",studentId);
	}
	
	public int insertStudentMng(HashMap<String, Object> paraMap){
		return insert("insertStudentMng", paraMap);
	}
}
