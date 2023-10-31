package com.project.harubang.reply;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;

	
	// 댓글 작성
	@PostMapping(value = "/replyWrite")
	public String replyWrite(ReplyVO vo, Model model) throws Exception {
		System.out.println(vo.getSeq()+"");
		replyService.replyWrite(vo);
		List<ReplyVO> replyList = replyService.replyList(vo.getSeq());

		model.addAttribute("reply", replyList);
		int num = vo.getSeq();
		return "redirect:/getBoardListGo";
	}
	
	// 글 삭제
	@RequestMapping("/replyDelete")
	public String replyDelete(ReplyVO vo, @RequestParam("seq") int seq, @RequestParam("cseq") int cseq, Model model) throws Exception{
		
		vo.setSeq(seq);
		vo.setCseq(cseq);
		replyService.replyDelete(vo);
		
		return "redirect:/getBoardListGo";
	}
	
}