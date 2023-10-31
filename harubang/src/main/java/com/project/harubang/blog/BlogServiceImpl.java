package com.project.harubang.blog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper mapper;
	
	@Override
	public int submitBlog(BlogVO vo) {
		 // �쁽�옱 �궇吏�/�떆媛�
        LocalDateTime now = LocalDateTime.now();
        // �룷留룻똿 2021�뀈 06�썡 17�씪 06�떆 43遺� 21珥�
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
        String html = vo.getBcontent();
        int beginIndex = html.indexOf("src=");
        String realrealResult="";
        if(beginIndex>=1) {
            String result = html.substring(beginIndex);
            String[] realResult = result.split(" style");
            String aa = realResult[0];
            realrealResult = aa.substring(5,aa.length()-1);
        }else {
        	realrealResult = "/resources/images/noticeimg/jejuharu.png";
        }
        vo.setBimgpath(realrealResult);
        System.out.println("--------------------------------------------------");
        System.out.println(realrealResult);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        vo.setWritedate(formatedNow);
        return mapper.submitBlog(vo);
	}

	@Override
	public BlogVO editBlog(BlogVO vo) {
		System.out.println(mapper.editBlog(vo));
		return mapper.editBlog(vo);
	}
	
	@Override
	public List<BlogVO> getList(){
		return mapper.getList();
	}
	
	@Override
	public String getInfoPage(BlogVO vo){
		BlogVO resultVO = mapper.getInfoPage(vo);
		
		String result = resultVO.getId()+"^"+resultVO.getTitle()+"^"+resultVO.getWritedate()+"^"+resultVO.getBcontent();
		return result;
	}
	
	@Override
	public boolean editSubmitBlog(BlogVO vo) {
        String html = vo.getBcontent();
        int beginIndex = html.indexOf("src=");
        String realrealResult="";
        if(beginIndex>=1) {
            String result = html.substring(beginIndex);
            String[] realResult = result.split(" style");
            String aa = realResult[0];
            realrealResult = aa.substring(5,aa.length()-1);
        }else {
        	realrealResult = "/resources/images/noticeimg/jejuharu.png";
        }
        vo.setBimgpath(realrealResult);
		int num = mapper.editSubmitBlog(vo);
		if(num==1) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int deleteBlog(BlogVO vo) {
		return mapper.deleteBlog(vo);
	}


}
