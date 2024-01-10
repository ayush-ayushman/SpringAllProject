package com.ty.app.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.app.dto.User;

@Controller
public class UserController {
	@RequestMapping(value = "/register")
	public String loadRegisterPage() {
		return "register";
	}

	@RequestMapping(value = "/login")
	public String loadmainloginPage() {
		return "login";
	}

	@RequestMapping(value = "/saveuser")
	public String createUser(HttpServletRequest request) {

		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNumber(Long.parseLong(phone));
		user.setPassword(password);

		request.setAttribute("user", user);

		return "success";
	}

	@RequestMapping(value = "/success")
	public String loadloginPage() {
		return "login";

	}

	@RequestMapping(value = "/validate")
	public String loginValidation(HttpServletRequest request) {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if (email.equals("admin@gmail.com") && password.equals("admin")) {
			request.setAttribute("name", "Admin successfully logged in");
			return "validate";
		} else {
			request.setAttribute("name", "invalid credentials");
			return "login";
		}

	}

}
