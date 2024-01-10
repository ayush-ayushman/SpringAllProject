package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public String One()
	{
		System.out.println("Ayush");
		return "redirect:/enjoy";
		
	}
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("Ayushman");
		return "";
		
	}
	@RequestMapping("/two")
	public RedirectView call()
	{
		System.out.println("welcome");
		RedirectView rv=new RedirectView();
		rv.setUrl("enjoy");
		return rv;
		
	}

}
