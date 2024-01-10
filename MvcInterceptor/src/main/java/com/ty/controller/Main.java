package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	@RequestMapping("/ap")
	public String hm()
	{
		return "home";
		
	}
	@RequestMapping("/welcome")
	public String apple(@RequestParam("user") String name,Model m)
	{
		System.out.println(name);
		m.addAttribute("name" ,name);
		return "welcome";
		
	}

}
