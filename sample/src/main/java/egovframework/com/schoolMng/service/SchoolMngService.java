package egovframework.com.schoolMng.service;

import java.util.HashMap;
import java.util.List;

public interface SchoolMngService {
	public List<HashMap<String, Object>> selectSchoolList();
	
	public HashMap<String, Object> selectSchoolInfo(int schoolIdx);
	
	public int insertSchoolInfo(HashMap<String, Object> paraMap);
	
	public int deleteSchoolInfo(HashMap<String, Object> paraMap);
	
	public int updateSchoolInfo(HashMap<String, Object> paraMap);
}