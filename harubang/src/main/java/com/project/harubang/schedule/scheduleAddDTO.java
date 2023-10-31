package com.project.harubang.schedule;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class scheduleAddDTO {
	private int scheduleNumber;
	private String id;
	private String scheduleName;
	private String detailSchedule;
}
