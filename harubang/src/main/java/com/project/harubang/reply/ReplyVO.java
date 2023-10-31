package com.project.harubang.reply;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyVO {

	private int seq;
	private int cseq;
	private String id;
	private String ccontent;
	private Date writedate;

}
