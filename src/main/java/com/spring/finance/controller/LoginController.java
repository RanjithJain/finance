package com.spring.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.finance.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPagee(ModelMap model) {
		 return "login";
	   }
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPagee(ModelMap model) {
		 return "logout";
	   }
	
	@RequestMapping(value = "/loginSuccess", method = RequestMethod.POST)
    public ModelAndView loginSuccess(@RequestParam("username")String username, @RequestParam("password")String password) {
		
		boolean isValid = loginService.checkLogin(username, password);
		System.out.println("Is user valid?= " + isValid);
		String msg="";
		if(isValid) {
			msg = "Welcome " + username + "!";
		} else {
			msg = "Invalid credentials";
		}
		return new ModelAndView("result", "output", msg);
	   }

}
