package com.project.harubang.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.harubang.reply.ReplyService;
import com.project.harubang.reply.ReplyVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@Autowired
	private ReplyService replyService;

	// insertBoard 화면 페이지 띄워주기(Get)
	@GetMapping("/insertBoard")
	public String insertBoardPage(BoardVO vo) {
		
		return "/board/insertBoard";
	}
	
	// insertBoard 값 넣어서 다음 화면으로 보내주기(Post)
	@PostMapping(value = "/insertBoard", produces = "text/plain;charset=utf-8")
	public String insertBoard(BoardVO vo) {
		service.insertBoard(vo);
		
		return "redirect:/getBoardListGo";
	}
	
	// updateBoard 실행하여 최신 값 넣어서 다음 화면으로 보내주기(Post)
	@PostMapping(value="/updateBoard", produces = "text/plain;charset=utf-8")
	public String updateBoard(BoardVO vo, HttpSession session) {
		service.updateBoard(vo);
		
		return "redirect:/getBoardListGo";
	}
	
	// deleteBoard 실행하여 값 삭제 후 다음 화면으로 보내주기(Post)
	@RequestMapping("/deleteBoard")
	public String deleteBoard(BoardVO vo) {
		service.deleteBoard(vo);
		
		return "redirect:/getBoardListGo";
	}
	
	
	@GetMapping("/getBoard")
	public String getBoard(@RequestParam("seq") int seq, Model model,HttpSession session) throws Exception {
	      
		  BoardVO vo = service.getBoard(seq);
	      model.addAttribute("getBoard", vo);
	      session.setAttribute("seq", vo.getSeq());
	      BoardVO board = service.getBoard(vo);
	      model.addAttribute("board", board);

	      List<ReplyVO> reply = replyService.replyList(seq);
	      model.addAttribute("reply", reply);
	      
	      return "redirect:/getBoardGo";
	   }

	
	// 글 상세보기 실행
	@RequestMapping("/getBoardGo")
	public String getBoard(BoardVO vo, Model model, @RequestParam("seq") int seq) throws Exception {
		
		service.increaseViewCount(vo);
		model.addAttribute("board", service.getBoard(vo));
		
		BoardVO board = service.getBoard(vo);
		model.addAttribute("board", board);
		
		List<ReplyVO> reply = replyService.replyList(seq);
	    model.addAttribute("reply", reply);
		
		return "/board/getBoard";
	}
	
	@GetMapping("/board/getBoardList")
	public String getBoardList() {
		
		return "redirect:/getBoardListGo";
	}
	
	// 글 목록 화면 띄워주기(Post), insert, update, delete 기능처리 후, jsp 불러오기 
	@RequestMapping("/getBoardListGo")
	public String getBoardList(BoardVO vo, Model model){
		
		List<BoardVO> boardList = service.getBoardList(vo, vo.getSearchCondition(), vo.getSearchKeyword());
		model.addAttribute("boardList", service.getBoardList(vo));
		
		return "/board/getBoardList";
	}
}
