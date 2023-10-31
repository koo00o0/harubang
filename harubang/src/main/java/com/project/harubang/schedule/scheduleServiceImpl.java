package com.project.harubang.schedule;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class scheduleServiceImpl implements scheduleService{

	@Autowired
	scheduleMapper mapper;
	
	@Override
	public ArrayList<scheduleResultVO> scheduleList() {
		return mapper.scheduleList();
	}
	
	@Override
	public ArrayList<scheduleResultVO> showMapValue(String id) {
		return mapper.showMapValue(id);
	}

	@Override
	public ArrayList<scheduleResultVO> searchKeyWord(String keyword) {
		return mapper.searchKeyWord(keyword);
	}
	
	@Override
	public int AddSchedule(scheduleAddDTO scheduleaddDTO) {
		return mapper.AddSchedule(scheduleaddDTO);
	}
	
	@Override
	public ArrayList<scheduleAddDTO> myScheduleList(String id) {
		return mapper.myScheduleList(id);
	}
	
	@Override
	public ArrayList<scheduleAddDTO> myDetailSchedule(String id, String schedulenumber) {
		return mapper.myDetailSchedule(id, schedulenumber);
	}
}
