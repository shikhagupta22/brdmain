package com.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController 
{
	@RequestMapping("/login")
	public String login()
	{
		return "Login";
	}
	@RequestMapping("/welcomemaker")
	public String maker()
	{
		return "Menu";
	}
	@RequestMapping("/welcomechecker")
	public String checker()
	{
		return "Checker";
	}
/*	@RequestMapping("/")
	public String welcome()
	{
		return "Menu";
	}*/
//	@RequestMapping("/welcome")
//	public String handler()
//	{
//		return "Menu";
//		
//	}
//	
	@RequestMapping("/accessdenied")
	public String accessdenied()
	{
		return "access";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		return "Logout";
	}
}
