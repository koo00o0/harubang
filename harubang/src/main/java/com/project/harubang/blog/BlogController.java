package com.project.harubang.blog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.JsonObject;
import com.project.harubang.user.UserService;


@Controller
public class BlogController {
	
	@Autowired
	private BlogService service;
	
	@GetMapping(value="/goBlog",produces="text/plain;charset=utf-8")
	public String insertBlog(BlogVO vo) {
		return "/blog/writeBlog";
	}
	
	@PostMapping(value="/editBlog",produces="text/plain;charset=utf-8")
	public String editBlog(BlogVO vo, Model model) {
		BlogVO resultVO = service.editBlog(vo);
		model.addAttribute("vo",resultVO);
		return "/blog/editBlog";		
	}
	
	@PostMapping(value="/editB",produces="text/plain;charset=utf-8")
	@ResponseBody
	public String editB(BlogVO vo) {
		BlogVO resultVO = service.editBlog(vo);
		String content = resultVO.getBcontent();
		String title = resultVO.getTitle();
		String name = resultVO.getId();
		String result = content+"^"+title+"^"+name;
		return result;
	}
	
	@PostMapping(value="/updateBlog",produces="text/plain;charset=utf-8")
	public String updateBlog(BlogVO vo, Model model) {
		System.out.println("-------------------------");
		System.out.println(vo+"-------------------------");
		System.out.println("-------------------------");
		boolean isSuccess = service.editSubmitBlog(vo);
		if(isSuccess) {
			return "/blog/toolsBlog";	
		}else {
			return "/blog/editBlog";
		}		
	}
	
	@PostMapping(value="/submitBlog",produces="text/plain;charset=utf-8")
	public String submitBlog(BlogVO vo) {
		
		int num = service.submitBlog(vo);
		if(num==1) { 
			//�꽦怨�
			System.out.println("�꽦怨�!");
		}else {
			//�떎�뙣 (�슦�슱,, 醫뚯젅,, �젅留�,,)
			System.out.println("�슦�슱,,,醫뚯젅,,,�젅留�,,,");
		}
		return "/blog/toolsBlog";		
	}
	
	@GetMapping(value="/getList",produces="text/plain;charset=utf-8")
	public String blogListGET(Model model) {
		
		model.addAttribute("list",service.getList());
		return "/blog/toolBlog";
	}
	
	
	@PostMapping(value="/infoPage",produces="text/plain;charset=utf-8")
	@ResponseBody
	public String getInfoPage(BlogVO vo) {
		String resultHTML = service.getInfoPage(vo);
		System.out.println(resultHTML);
		return resultHTML;
	}

	@PostMapping("/deleteBlog")
	public String deleteBlog(BlogVO vo) {
		System.out.println(vo.getSeq());
		int num = service.deleteBlog(vo);
		if(num==1) { 
			//�꽦怨�
			System.out.println("�꽦怨�!");

		}else {
			//�떎�뙣 (�슦�슱,, 醫뚯젅,, �젅留�,,)
			System.out.println("�슦�슱,,,醫뚯젅,,,�젅留�,,,");
		}
		return "/blog/toolsBlog";		
	}
	
	
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "fileupload.do")
    public void communityImageUpload(HttpServletRequest req, HttpServletResponse resp, MultipartHttpServletRequest multiFile) throws Exception{
		JsonObject jsonObject = new JsonObject();
		PrintWriter printWriter = null;
		OutputStream out = null;
		MultipartFile file = multiFile.getFile("upload");
		
		if(file != null) {
			if(file.getSize() >0 && StringUtils.isNotBlank(file.getName())) {
				if(file.getContentType().toLowerCase().startsWith("image/")) {
				    try{
				    	 
			            String fileName = file.getOriginalFilename();
			            byte[] bytes = file.getBytes();
			           
			            String uploadPath = req.getSession().getServletContext().getRealPath("/resources/images/noticeimg"); //���옣寃쎈줈
			            System.out.println("uploadPath:"+uploadPath);

			            File uploadFile = new File(uploadPath);
			            if(!uploadFile.exists()) {
			            	uploadFile.mkdir();
			            }
			            String fileName2 = UUID.randomUUID().toString();
			            uploadPath = uploadPath + "/" + fileName2 +fileName;
			            
			            //�씠誘몄� ���옣
			            out = new FileOutputStream(new File(uploadPath));
			            out.write(bytes);
			            
			            //ckEditor濡� �쟾�넚
			            printWriter = resp.getWriter();
			            String fileUrl = req.getContextPath() + "/resources/images/noticeimg/" +fileName2 +fileName; //url寃쎈줈
			            System.out.println("fileUrl :" + fileUrl);
			            JsonObject json = new JsonObject();
			            json.addProperty("uploaded", 1);
			            json.addProperty("fileName", fileName);
			            json.addProperty("url", fileUrl);
			            printWriter.print(json);
			            System.out.println(json);
			 
			        }catch(IOException e){
			            e.printStackTrace();
			        } finally {
			            if (out != null) {
		                    out.close();
		                }
		                if (printWriter != null) {
		                    printWriter.close();
		                }
			        }
				}

			
		}
		
	}
}
	
	

//	@RequestMapping(value = "/upload.do", method = RequestMethod.POST)
//	public void uploadimg(HttpServletRequest req,HttpServletResponse resp, MultipartFile upload, MultipartHttpServletRequest multiFile) throws Exception {
//		JsonObject jsonObject = new JsonObject();
//		PrintWriter printWriter = null;
//		OutputStream out = null;
//		MultipartFile file = multiFile.getFile("upload");
//		System.out.println("�뱾�뼱�샂");
//		
//		if(file != null) {
//			if(file.getSize() >0 && StringUtils.isNotBlank(file.getName())) {
//				if(file.getContentType().toLowerCase().startsWith("image/")) {
//				    try{
//				    	 
//			            String fileName = file.getOriginalFilename();
//			            byte[] bytes = file.getBytes();
//			            UUID uid = UUID.randomUUID();
//			            //�씠誘몄� 寃쎈줈 �깮�꽦
//			            String uploadPath = "C:\\Users\\kbohe\\Desktop\\harubangP\\harubang\\src\\main\\webapp\\resources\\images\\noticeimg";
//			            String ckUploadPath = uploadPath + uid + "_" + fileName;
//			            File uploadFile = new File(uploadPath);
//			            
//
//			            if(!uploadFile.exists()) {
//			            	uploadFile.mkdir();
//			            }
//			            String fileName2 = UUID.randomUUID().toString();
//			            uploadPath = uploadPath + "/" + fileName2 +fileName;
//			            
//			            //�씠誘몄� ���옣
//			            out = new FileOutputStream(new File(uploadPath));
//			            out.write(bytes);
//			            out.flush();
//			            
//			            //ckEditor濡� �쟾�넚
//			            printWriter = resp.getWriter();
//			            String fileUrl = req.getContextPath() + "/resources/images/noticeimg/" +fileName2 +fileName; //url寃쎈줈
//			            System.out.println("fileUrl :" + fileUrl);
//			            JsonObject json = new JsonObject();
//			            json.addProperty("uploaded", 1);
//			            json.addProperty("fileName", fileName);
//			            json.addProperty("url", fileUrl);
//			            printWriter.print(json);
//			            System.out.println(json);
//			            
//			            printWriter.flush();
//			 
//			        }catch(IOException e){
//			            e.printStackTrace();
//			        } finally {
//			            if (out != null) {
//		                    out.close();
//		                }
//		                if (printWriter != null) {
//		                    printWriter.close();
//		                }
//			        }
//				}
//		}		
//	}
//   
//	}
	

}