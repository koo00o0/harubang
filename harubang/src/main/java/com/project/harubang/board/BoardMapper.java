package com.project.harubang.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	
	void insertBoard(BoardVO vo);
	
	void deleteBoard(BoardVO vo);
	
	void updateBoard(BoardVO vo);
	
	void increaseViewCount(BoardVO vo);
	
	BoardVO getBoard(BoardVO vo);
	
	BoardVO getBoard(int seq);
	
	List<BoardVO> getBoardList(BoardVO vo);
	
	List<BoardVO> getBoardList(BoardVO vo, String searchCondition, String searchKeyword);
}
