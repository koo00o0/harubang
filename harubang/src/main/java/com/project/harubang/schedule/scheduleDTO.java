package com.project.harubang.schedule;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class scheduleDTO {

	private String itemId;
	private String itemName;
	private String addressId;
	private String checkId;
	private int likeCnt;
	private String imgfile;
	private String detail;
	private String sort;
}
