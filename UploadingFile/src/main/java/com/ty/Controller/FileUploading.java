package com.ty.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploading {
	@RequestMapping("/app")
	public String apply()
	{
		return "formfile";
		
	}
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String succ(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m) throws IOException
	{
		
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		byte[] data=file.getBytes();
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		m.addAttribute("filename",file.getOriginalFilename());
		return "filesuccess";
		
	}

}
