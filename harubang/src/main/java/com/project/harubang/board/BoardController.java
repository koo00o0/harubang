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

	// insertBoard ȭ�� ������ ����ֱ�(Get)
	@GetMapping("/insertBoard")
	public String insertBoardPage(BoardVO vo) {
		
		return "/board/insertBoard";
	}
	
	// insertBoard �� �־ ���� ȭ������ �����ֱ�(Post)
	@PostMapping(value = "/insertBoard", produces = "text/plain;charset=utf-8")
	public String insertBoard(BoardVO vo) {
		service.insertBoard(vo);
		
		return "redirect:/getBoardListGo";
	}
	
	// updateBoard �����Ͽ� �ֽ� �� �־ ���� ȭ������ �����ֱ�(Post)
	@PostMapping(value="/updateBoard", produces = "text/plain;charset=utf-8")
	public String updateBoard(BoardVO vo, HttpSession session) {
		service.updateBoard(vo);
		
		return "redirect:/getBoardListGo";
	}
	
	// deleteBoard �����Ͽ� �� ���� �� ���� ȭ������ �����ֱ�(Post)
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

	
	// �� �󼼺��� ����
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
	
	// �� ��� ȭ�� ����ֱ�(Post), insert, update, delete ���ó�� ��, jsp �ҷ����� 
	@RequestMapping("/getBoardListGo")
	public String getBoardList(BoardVO vo, Model model){
		
		List<BoardVO> boardList = service.getBoardList(vo, vo.getSearchCondition(), vo.getSearchKeyword());
		model.addAttribute("boardList", service.getBoardList(vo));
		
		return "/board/getBoardList";
	}
}
