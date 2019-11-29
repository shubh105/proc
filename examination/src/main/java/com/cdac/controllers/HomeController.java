package com.cdac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.daos.UserDao;
import com.cdac.models.User;

@Controller
public class HomeController {

	@Autowired
	UserDao uDao;
	
	  @RequestMapping(value= "/") 
	  public String home() {
	  
		  return "homepage";
	  }
	 
	@RequestMapping(value = "/getSignUpForm")
	public String getUser() {
          
		return "register";
	}
	
	@RequestMapping(value="/add" , method=RequestMethod.POST)
	public String userRegister(@ModelAttribute("userObj") User userObj) {
		
		uDao.UserRegister(userObj);
		return "homepage";
		
		
	}
}