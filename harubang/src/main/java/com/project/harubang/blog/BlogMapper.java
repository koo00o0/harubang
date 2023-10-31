package com.project.harubang.blog;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.harubang.user.UserVO;

@Mapper
public interface BlogMapper {
	
	public String joinIdCheck(String id);
	
//	釉붾줈洹� �옉�꽦	
	public int submitBlog(BlogVO vo);
	
//  釉붾줈洹� �닔�젙
	public BlogVO editBlog(BlogVO vo);
	
//  釉붾줈洹� �닔�젙 ���옣
	public int editSubmitBlog(BlogVO vo);
	
//	釉붾줈洹� 紐⑸줉 議고쉶
	public List<BlogVO> getList();

//  釉붾줈洹� �젙蹂� 媛��졇�삤湲�
	public BlogVO getInfoPage(BlogVO vo);

//  釉붾줈洹� �궘�젣	
	public int deleteBlog(BlogVO vo);

}