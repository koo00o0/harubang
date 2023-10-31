package com.project.harubang.schedule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class scheduleResultVO {
	
	private scheduleAddressDTO scheduleAddressDTO;
	private scheduleDTO scheduleDTO;
	private String keyword;
	private String itemid;
}
