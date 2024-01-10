package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/ap")
	public String tall(HttpServletRequest req)
	{
		List<String> lis =new  ArrayList<String>();
		lis.add("Ayush");
		lis.add("Mohan");
		lis.add("Sita");
		req.setAttribute("name",lis);
		return "app";
		
	}

}
