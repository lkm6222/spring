package egovframework.com.schoolMng.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("SchoolMngDAO")
public class SchoolMngDAO extends EgovAbstractMapper{
	
	public List<HashMap<String, Object>> selectSchoolList(){
		return selectList("selectSchoolMngList");
	}
	
	public HashMap<String, Object> selectSchoolInfo(int schoolIdx){
		return selectOne("selectSchoolMngInfo", schoolIdx);
	}
	
	public int insertSchoolInfo(HashMap<String, Object> paraMap){
		return insert("insertSchoolMngInfo", paraMap);
	}
	
	public int deleteSchoolInfo(HashMap<String, Object> paraMap){
		return delete("deleteSchoolMngInfo", paraMap);
	}
	
	public int updateSchoolInfo(HashMap<String, Object> paraMap){
		return update("updateSchoolMngInfo", paraMap);
	}

}