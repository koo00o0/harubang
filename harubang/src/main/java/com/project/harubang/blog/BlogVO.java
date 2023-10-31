package com.project.harubang.blog;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BlogVO {

	private String id;
	private int seq;
	private int cnt;
	private String writedate;
	private String privatewrite;
	private String title;
	private String bcontent;
	private String bimgpath;
	private int likenum;
	private int dislikenum;
	private String fixwrite;
	
}
