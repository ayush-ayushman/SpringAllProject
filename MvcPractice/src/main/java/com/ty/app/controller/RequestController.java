package com.ty.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {
	@RequestMapping(path="/welcome")
	public String responseView()
	{
		return "response";
	}
   
}
