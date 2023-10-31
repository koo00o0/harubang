package com.project.harubang.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper mapper;
	

	@Override
	public void replyWrite(ReplyVO vo) throws Exception {
		mapper.replyWrite(vo);

	}

	@Override
	public void replyModify(ReplyVO vo) throws Exception {
		mapper.replyModify(vo);

	}

	@Override
	public void replyDelete(ReplyVO vo) throws Exception {
		mapper.replyDelete(vo);

	}
	
	@Override
	public ReplyVO replySelect(ReplyVO vo) throws Exception {
		return mapper.replySelect(vo);
	}

	@Override
	public List<ReplyVO> replyList(int seq) throws Exception {
		return mapper.replyList(seq);
	}


}
