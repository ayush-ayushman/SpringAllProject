package com.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ty.controller.entity.User;


@Controller
public class MainController {
	
	
	@ModelAttribute
	public void commondataformodel(Model m1)
	{
		m1.addAttribute("head","Apex");
		m1.addAttribute("tail", "steep");
	}
	@RequestMapping("/app")
	public String call()
	{
		return "display";
		
	}
    /*@RequestMapping("/pa")
	public String caller(@RequestParam("nm") String  username,@RequestParam("add") String useraddress,Model mo)
	{
		//System.out.println(username);
	//	System.out.println(useraddress);
		//mo.addAttribute("k1", username);
		//mo.addAttribute("k2",useraddress);
		User u=new User();
		u.setUname(username);
		u.setUadd(useraddress);
		mo.addAttribute("u1",u);
		return "formjsp";
		
	}
	*/
	@RequestMapping("/pa")
	public String caller(@ModelAttribute User u1 , Model mo)
	{
		System.out.println(u1);
		mo.addAttribute("u2",u1);
		
		return "formjsp";
		
	}

}
