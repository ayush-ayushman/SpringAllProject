package com.ty.controller;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/a")
	public String Call(Model mo)
	{
		//mo.addAttribute("name","Ayush Ayushman");
		List<String> lis= new ArrayList<String>();
		lis.add("a");
		lis.add("b");
		lis.add("c");
		mo.addAttribute("name", lis);
		return "see";
		
	}
	@RequestMapping("/help")
	public ModelAndView call()
	{
		
		//creating model object
		ModelAndView op=new ModelAndView();
		//setting the data
		op.addObject("name","Ayushman");
		//setting the view name
		op.setViewName("help");
		return op;
		
	}
	

}
