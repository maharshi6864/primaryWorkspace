package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.task.service.CountryService;
import com.task.vo.CountryVo;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping(value="/")
	public ModelAndView loadMainMenu()
	{
		return new ModelAndView("main");
		
	}
	
	@GetMapping(value="addcountry")
	public ModelAndView addCountry()
	{
		return new ModelAndView("addcountry","Country",new CountryVo());
		
	}
	
	@PostMapping(value="insertcountry")
	public ModelAndView insertcountry(@ModelAttribute CountryVo countryVo)
	{
		this.countryService.insertCountry(countryVo);
		return new ModelAndView("redirect:/addcountry");
		
	}
	
	@GetMapping(value="searchcountry")
	public ModelAndView searchCountry()
	{
		List<CountryVo> searchCountryList=this.countryService.searchCountry();
		return new ModelAndView("searchcountry","List",searchCountryList);
		
	}
}
