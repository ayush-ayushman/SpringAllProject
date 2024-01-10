package com.ty.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {
	@RequestMapping("/ap/{id}/{name}")
	public void ap(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		System.out.println(id);
		System.out.println(name);
		
		
	}

}
