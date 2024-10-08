package egovframework.com.studentMng.service;

import java.util.HashMap;
import java.util.List;

public interface StudentMngService {

	List<HashMap<String, Object>> selectStudentMngList();

	HashMap<String, Object> selectStudentMngInfo(int studentId);

	int insertStudentMng(HashMap<String, Object> paraMap);

}
