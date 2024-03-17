package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.RegisterService.RegisterService;
import com.demo.Vo.RegisterVo;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@GetMapping(value="/")
	public ModelAndView loadRegisterPage(){
		return new ModelAndView("register","RegisterVo",new RegisterVo());
	}
	
	@PostMapping(value="insert")
	public ModelAndView insert(@ModelAttribute RegisterVo registerVo){
		this.registerService.insert(registerVo);
		return new ModelAndView("register","RegisterVo",new RegisterVo());
	}
	
	@GetMapping(value="search")
	public ModelAndView search()
	{
		List<RegisterVo> searchList=this.registerService.search();
		return new ModelAndView("search","searchList",searchList);
	}
	
	@GetMapping(value="a")
	public ModelAndView edit(@ModelAttribute RegisterVo registerVo, @RequestParam int id){
		
		List<RegisterVo> editList=this.registerService.findById(id);
		registerVo=editList.get(0);
		return new ModelAndView("register","RegisterVo",registerVo);
	}
}
