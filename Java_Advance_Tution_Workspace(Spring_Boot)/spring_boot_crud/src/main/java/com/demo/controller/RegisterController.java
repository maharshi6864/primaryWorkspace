package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.RegisterVo;
import com.demo.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerSevice;
	
	@GetMapping(value="/")
	public ModelAndView loadRegister(){
		return new ModelAndView("register","RegisterVO",new RegisterVo());
	}
	
	@PostMapping(value="insert")
	public ModelAndView insertRegisterInformation(@ModelAttribute RegisterVo registerVO){
		System.out.print(registerVO.getFirstname());
		this.registerSevice.insert(registerVO);
		
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping(value = "search")
	public ModelAndView search() {
		List<RegisterVo> registerList = this.registerSevice.search();
		return new ModelAndView("search", "registerList", registerList);
	}

	@GetMapping(value = "delete")
	public ModelAndView delete(@ModelAttribute RegisterVo registerVO, @RequestParam int id) {

		List<RegisterVo> registerList = this.registerSevice.findById(id);

		registerVO = registerList.get(0);

		this.registerSevice.insert(registerVO);

		return new ModelAndView("redirect:/search");
	}

	@GetMapping(value = "edit")
	public ModelAndView edit(@ModelAttribute RegisterVo registerVO, @RequestParam int id) {

		List<RegisterVo> registerList = this.registerSevice.findById(id);

		registerVO = registerList.get(0);
		System.out.print(registerVO.getFirstname());

		return new ModelAndView("register", "RegisterVO", registerVO);
	}
}
