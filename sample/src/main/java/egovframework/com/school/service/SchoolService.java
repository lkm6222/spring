package egovframework.com.school.service;

import java.util.HashMap;
import java.util.List;

public interface SchoolService {

		public List<HashMap<String, Object>> selectSchoolList();
			
		public HashMap<String, Object> selectSchoolInfo(int schoolIdx);
		
		public int insertSchoolInfo(HashMap<String, Object> paraMap);
		
		public int deleteSchoolInfo(HashMap<String, Object> paraMap);
}
