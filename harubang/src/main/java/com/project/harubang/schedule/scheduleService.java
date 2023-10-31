package com.project.harubang.schedule;

import java.util.ArrayList;

public interface scheduleService {
	
	ArrayList<scheduleResultVO> scheduleList();
	
	ArrayList<scheduleResultVO> showMapValue(String id);
	
	ArrayList<scheduleResultVO> searchKeyWord(String keyword);
	
	int AddSchedule(scheduleAddDTO scheduleaddDTO);
	
	ArrayList<scheduleAddDTO> myScheduleList(String id);
	
	ArrayList<scheduleAddDTO> myDetailSchedule(String id, String schedulenumber);
	
}
