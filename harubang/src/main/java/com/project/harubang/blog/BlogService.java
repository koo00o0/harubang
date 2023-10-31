package com.project.harubang.blog;

import java.util.List;

public interface BlogService {

	int submitBlog(BlogVO vo);
	
	BlogVO editBlog(BlogVO vo);
	
	public List<BlogVO> getList();

	String getInfoPage(BlogVO vo);

	int deleteBlog(BlogVO vo);

	boolean editSubmitBlog(BlogVO vo);
	

}
