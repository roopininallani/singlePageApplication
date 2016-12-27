package com.niit.day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/")

	public String homepage() {
System.out.println("home page method in controller");
		return "home";
	}


	@RequestMapping("/login")
	
	public ModelAndView showLoginPage()
	{
	ModelAndView mv = new ModelAndView("home");
	mv.addObject("msg","you clicked login link");
	mv.addObject("showLoginPage","true");
	System.out.println("login method in controller");
	return mv;
	 
	
	}
	
	@RequestMapping("/registration")
	
	public ModelAndView showRegistrationPage()
	{
	ModelAndView mv = new ModelAndView("home");
	mv.addObject("msg","you clicked registration  link");
	mv.addObject("showRegistrationPage","true");
	
	System.out.println("registration method in controller");
	
	return mv;
	} 
	
}

