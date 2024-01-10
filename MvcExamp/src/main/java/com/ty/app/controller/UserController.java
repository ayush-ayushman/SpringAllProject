package com.ty.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.app.dto.User;
@Controller
public class UserController {
	@RequestMapping(value="/user")
	public String userForm()
	{
		return "form";
	}
	@RequestMapping(value="/save")
	public String createUser(HttpServletRequest httpServletRequset)
	{
		String firstName=httpServletRequset.getParameter("fname");
		String k="";
		char ch[]=firstName.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			k=k+ch[i];
		}
		User user=new User();
		user.setName(k);
		httpServletRequset.setAttribute("user",user);
		return "response";
		
	}

}
