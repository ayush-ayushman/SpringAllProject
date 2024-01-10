package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.entities.Customer;

@Controller
public class MainController {
	List<Customer> list=new ArrayList<Customer>();
	@RequestMapping("/ap")
	public String reg()
	{
		return "custinfo";
	}
	@RequestMapping("/app")
	public String registration(@ModelAttribute Customer cust,Model model)
	{
		list.add(cust);
	  model.addAttribute("customer" ,list)	;
		return "display";
		
	}

}
