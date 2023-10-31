package com.project.harubang.board;

import java.util.List;

public interface BoardService {
	
	void insertBoard(BoardVO vo);
	
	void deleteBoard(BoardVO vo);
	
	void updateBoard(BoardVO vo);
	
	void increaseViewCount(BoardVO vo);
	
	BoardVO getBoard(BoardVO vo);
	
	BoardVO getBoard(int seq);
	
	List<BoardVO> getBoardList(BoardVO vo);
	
	List<BoardVO> getBoardList(BoardVO vo, String searchCondition, String searchKeyword);
}
