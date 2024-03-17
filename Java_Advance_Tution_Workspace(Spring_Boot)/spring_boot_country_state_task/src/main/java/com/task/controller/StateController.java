package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.task.service.StateService;
import com.task.vo.CountryVo;
import com.task.vo.StateVo;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;
	
	@GetMapping(value="addstate")
	public ModelAndView addState()
	{
		List<CountryVo> getCountryList=this.stateService.getCountryList();
		return new ModelAndView("addstate","stateVo",new StateVo()).addObject("countryList", getCountryList);
	}
	
	@PostMapping(value="insertstate")
	public ModelAndView insertState(@ModelAttribute StateVo stateVo)
	{
		this.stateService.insertState(stateVo);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping(value="viewstate")
	public ModelAndView searchState(){
		List<StateVo> searchStateList =this.stateService.searchState();
		System.out.println(searchStateList.get(0).getState());
		return new ModelAndView("searchstate","searchStateList",searchStateList);
	}
	
	@GetMapping(value="edit")
	public ModelAndView editState(@ModelAttribute StateVo stateVo, @RequestParam int id){
		List<StateVo> searchStateList =this.stateService.findById(id);
		stateVo=searchStateList.get(0);
		List<CountryVo> getCountryList=this.stateService.getCountryList();
		return new ModelAndView("addstate","stateVo",stateVo).addObject("countryList", getCountryList);
	}
	
}
