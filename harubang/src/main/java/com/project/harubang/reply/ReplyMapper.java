package com.project.harubang.reply;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {

	public void replyWrite(ReplyVO vo) throws Exception;
	
	public void replyModify(ReplyVO vo) throws Exception;
	
	public void replyDelete(ReplyVO vo) throws Exception;
	
	// 단일 댓글 조회
	public ReplyVO replySelect(ReplyVO vo) throws Exception;
	
	public List<ReplyVO> replyList(int seq) throws Exception;

}
