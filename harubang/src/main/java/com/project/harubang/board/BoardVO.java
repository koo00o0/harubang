package com.project.harubang.board;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardVO {
	
	private String id;
	private int seq;
	private int cnt;
	private Date writedate;
	private String bcategory;
	private String title;
	private String bcontent;

	// 검색 기능 필드
	private String searchCondition;
	private String searchKeyword;
	
}
