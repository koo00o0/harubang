package com.project.harubang.schedule;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface scheduleMapper {

	ArrayList<scheduleResultVO> scheduleList();
	
	ArrayList<scheduleResultVO> showMapValue(String id);
	
	ArrayList<scheduleResultVO> searchKeyWord(String keyword);
	
	int AddSchedule(scheduleAddDTO scheduleaddDTO);
	
	ArrayList<scheduleAddDTO> myScheduleList(String id);
	
	ArrayList<scheduleAddDTO> myDetailSchedule(@Param("id") String id, @Param("scheduleNumber") String schedulenumber);
}
