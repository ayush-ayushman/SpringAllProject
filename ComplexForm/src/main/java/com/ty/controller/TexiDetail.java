package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TexiDetail {
	@RequestMapping("/add")
	public String call()
	{
		return "complex";
		
	}
	@RequestMapping("/hello")
	public String formhandler(@ModelAttribute("user") UserDetails user,Model mpo,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex";
		}
		System.out.println(user.getAddress());
		mpo.addAttribute("user2",user);
		return "success";
		
	}

}
