package egovframework.com.studentMng.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.studentMng.service.StudentMngService;

@Controller
public class StudentMngController {

	@Resource(name = "StudentMngService")
	private StudentMngService studentMngService;

	@RequestMapping("/studentMng/getStudentList.do")
	public String getSchoolList(Model model) {
		List<HashMap<String, Object>> list = studentMngService.selectStudentMngList();
		model.addAttribute("studentMngList", list);

		return "studentMng/studentMngList";
	}

	@RequestMapping("/studentMng/selectStudentMngList.do")
	public ModelAndView selectStudentMngList() {
		ModelAndView mv = new ModelAndView();

		List<HashMap<String, Object>> list = studentMngService.selectStudentMngList();

		mv.addObject("list", list);
		mv.setViewName("jsonView");
		return mv;
	}

	@RequestMapping("/studentMng/getStudentMngInfo.do")
	/*
	 * public String getStudentMngInfo(@RequestParam HashMap<String, Object>
	 * paraMap, Model model){
	 * 
	 * if(!paraMap.isEmpty()) { int studentId =
	 * Integer.parseInt(paraMap.get("studentId").toString()); HashMap<String,Object>
	 * studentInfo = studentMngService.selectStudentMngInfo(studentId);
	 * 
	 * model.addAttribute("studentInfo", studentInfo); } return
	 * "studentMng/studentMngDetail"; }
	 */
	
	public ModelAndView getStudentMngInfo(@RequestParam HashMap<String, Object> paraMap) {
		ModelAndView mv = new ModelAndView();
		
		if(!paraMap.isEmpty()) {
			int studentId = Integer.parseInt(paraMap.get("studentId").toString());
			HashMap<String, Object> studentInfo = studentMngService.selectStudentMngInfo(studentId);
			mv.addObject("studentInfo", studentInfo);
		}
		
		mv.setViewName("studentMng/studentMngDetail");
		return mv;
	}
}
