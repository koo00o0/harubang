package com.project.harubang.schedule;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class scheduleController {
	
	private static final Logger logger = LoggerFactory.getLogger(scheduleController.class);
	
	@Autowired
	scheduleService service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	/* 나의 여행 PAGE 이동 */
	@RequestMapping(value = "/schedule/schedule", method = RequestMethod.GET)
	public String schedule(Model model) {
		logger.info("Welcome schedule!");
		return "/schedule/schedule";
	}
	
	/* 나의 일정 만들기 PAGE 이동 및 session ID 값 넘기기 */
	@RequestMapping(value = "/schedule/makeSchedule", method = RequestMethod.GET)
	public String scheduleList(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		
		if(id == null || id.equals("")) {
			return "/user/login";
		}else {
			logger.info("Welcome makeschedule!");
			model.addAttribute("scheduleList", service.scheduleList());
			return "/schedule/makeSchedule";
		}
	}
	
	/* 지도 값에 필요한 데이터 받아오기 */ 
	@RequestMapping(value="/schedule/showMapValue")
	@ResponseBody
	public ArrayList<scheduleResultVO> showMapValue(Model model, @RequestParam String id) throws IOException {
		ArrayList<scheduleResultVO> result = service.showMapValue(id);
		return result;
	}
	
	/* 장소 검색 데이터 받아오기 */ 
	@RequestMapping(value="/schedule/searchKeyWord")
	@ResponseBody
	public ArrayList<scheduleResultVO> searchKeyWord(Model model, @RequestParam String keyword) throws IOException {
		ArrayList<scheduleResultVO> searchResult = service.searchKeyWord(keyword);
		return searchResult;
	}
	
	/* 나의 여행 PAGE 이동 */
	@RequestMapping(value = "/schedule/AddSchedule", method = RequestMethod.POST)
	@ResponseBody
	public String AddSchedule(scheduleAddDTO scheduleaddDTO,@RequestParam String id,@RequestParam String scheduleName,@RequestParam String detailSchedule) {
		logger.info("Welcome AddSchedule!");
		
		System.out.println(id);
		scheduleaddDTO.setId(id);
		scheduleaddDTO.setScheduleName(scheduleName);
		scheduleaddDTO.setDetailSchedule(detailSchedule);
		int AddResult = service.AddSchedule(scheduleaddDTO);
		String result = "";
		if (AddResult == 1) {
			result= "T";
			return result;
		} else {
			result= "F";
			return result;

		}
	}
	
	/* 나의 일정 LIST로 받아서 출력 */
	@RequestMapping(value="/schedule/myScheduleList")
	@ResponseBody
	public ArrayList<scheduleAddDTO> myScheduleList(Model model, HttpSession session) throws IOException {
		String id = (String) session.getAttribute("id");
		ArrayList<scheduleAddDTO> myresult = service.myScheduleList(id);
		return myresult;
	}
	
	/* 나의 일정 myDetailSchedule로 받아서 출력 */
	@RequestMapping(value="/schedule/myDetailSchedule")
	@ResponseBody
	public ArrayList<scheduleAddDTO> myDetailSchedule(Model model,@RequestParam String id, @RequestParam String schedulenumber) throws IOException {
		
		ArrayList<scheduleAddDTO> mydetailresult = service.myDetailSchedule(id, schedulenumber);
		return mydetailresult;
	}
	
	@RequestMapping(value = "/schedule/myDetailSchedule", method = RequestMethod.GET)
	public String myDetailSchedule() {
		logger.info("Welcome myDetailSchedule!");
		return "/schedule/myDetailSchedule";
	}
	
}
