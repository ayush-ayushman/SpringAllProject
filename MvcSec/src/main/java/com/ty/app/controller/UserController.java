package com.ty.app.controller;

import javax.servlet.http.HttpServlet;
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
		String lastName=httpServletRequset.getParameter("lname");
		String email=httpServletRequset.getParameter("email");
		String phone=httpServletRequset.getParameter("phno");
		User user=new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPhone(Long.parseLong(phone));
		user.setEmail(email);
		httpServletRequset.setAttribute("user",user);
		return "response";
		
	}
   
}
