package com.project.harubang.info;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoController {

	@Autowired
	InfoService service;

	@RequestMapping(value = "/info/infoList")
	public String infoList(Model model) throws IOException {

		model.addAttribute("infoList", service.infoList());

		return "/info/infoList";
	}

	@RequestMapping(value = "/info/itemIdCheck")
	@ResponseBody
	public ArrayList<InfoResultVO> itemIdCheck(Model model, @RequestParam String id) throws IOException {

		ArrayList<InfoResultVO> result = service.itemIdCheck(id);

		return result;
	}

	@RequestMapping(value = "/heart")
	@ResponseBody
	public ArrayList<InfoHeartCheck> heart(InfoHeartCheck vo, Model model, @RequestParam String checkId,
			HttpSession session) throws IOException {

		String id = (String) session.getAttribute("id");

		vo.setId(id);
		vo.setCheckId(checkId);

		service.heart(vo, id, checkId);
		System.out.println(vo);
		ArrayList<InfoHeartCheck> result = service.getHeart(vo);
		return result;

	}

	@RequestMapping(value = "/getHeart")
	@ResponseBody
	public ArrayList<InfoHeartCheck> getHeart(InfoHeartCheck vo, Model model, HttpSession session) throws IOException {

		String id = (String) session.getAttribute("id");
		vo.setId(id);

		ArrayList<InfoHeartCheck> ps = service.getHeart(vo);
		System.out.println(ps);
		return ps;

	}

}
