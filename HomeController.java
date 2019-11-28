package com.ranps.proc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ranps.proc.daos.UserDao;
import com.ranps.proc.models.UserRegistration;

@Controller
public class HomeController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/register")
	public String getRegisterPage() {
		
		return "register.jsp";
	}
	
	@RequestMapping("/adduser")
	public String register(@ModelAttribute("User") UserRegistration user ) {
		
		userDao.registerUser(user);
	
		return "home.jsp";
		
	}
	
	
	
	
}
