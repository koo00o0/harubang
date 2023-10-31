package com.project.harubang.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	public void insertBoard(BoardVO vo) {
		mapper.insertBoard(vo);
	}
	
	public void updateBoard(BoardVO vo) {
		mapper.updateBoard(vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		mapper.deleteBoard(vo);
	}
	
	public void increaseViewCount(BoardVO vo) {
		mapper.increaseViewCount(vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return mapper.getBoard(vo);
	}
	
	public BoardVO getBoard(int seq) {
		return mapper.getBoard(seq);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		return mapper.getBoardList(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo, String searchCondition, String searchKeyword) {
		
		vo.setSearchCondition(searchCondition);
	    vo.setSearchKeyword(searchKeyword);

	     return mapper.getBoardList(vo);
	}


	
	
	
}