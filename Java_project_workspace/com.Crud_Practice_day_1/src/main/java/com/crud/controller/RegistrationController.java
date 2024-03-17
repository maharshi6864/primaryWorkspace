package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.crud.service.Dto;
import com.crud.service.Registration;

@org.springframework.stereotype.Controller
public class RegistrationController {
	
	@Autowired
	public Registration register;
	
	@GetMapping(value="/")
	public ModelAndView home()
	{
		List<Dto> dtoList=this.register.search();
		return new ModelAndView("home","dtoList",dtoList);
	}
	
	@GetMapping(value="register")
	public ModelAndView registerSudent()
	{
		return new ModelAndView("registration","student",new Dto());
	}
	
	@PostMapping(value="insert")
	public ModelAndView insert(@ModelAttribute Dto dto)
	{
		System.out.println("Inserting controller");
		register.insert(dto);
		
		return new ModelAndView("redirect:/register");
	}
	
	@GetMapping(value="edit")
	public ModelAndView editSudent()
	{
		List<Dto> dtoList=this.register.search();
		return new ModelAndView("search","dtoList",dtoList);
	}
}
