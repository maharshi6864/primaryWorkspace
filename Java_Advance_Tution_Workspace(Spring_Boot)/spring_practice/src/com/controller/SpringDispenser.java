package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Dao;
import com.vo.Vo;

@Controller
public class SpringDispenser {
	
	@Autowired
	private Dao d;

	@RequestMapping(value="hello.html", method= RequestMethod.GET)
	public ModelAndView hello(){
		String str="Hello World";
		return new ModelAndView("hello","message",str);
	}
	
	@RequestMapping(value="register.html", method= RequestMethod.GET)
	public ModelAndView registerForm(){
		String str="Register Here";
		return new ModelAndView("register","message",str).addObject("regobj",new Vo());
	}
	
	@RequestMapping(value="save.html", method= RequestMethod.POST)
	public ModelAndView saveRegisterInfo(@ModelAttribute Vo v){
		d.insert(v);
		return new ModelAndView("redirect:register.html");
	}
}
