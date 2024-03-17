package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.vo.RegisterVo;

@Controller
public class DemoController {

	
	
	@GetMapping(value="/")
	public ModelAndView loadRegister()
	{
		return new ModelAndView("register","registerVo",new RegisterVo());
	}
	
	@PostMapping(value="/addUser")
	public ModelAndView addUser(@ModelAttribute RegisterVo registerVo)
	{
		HttpSession session= request
		return ModelAndView("login","loginVo");
	}
	
}
