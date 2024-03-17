package com.controller;

import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Dao;
import com.vo.CountryVo;
import com.vo.StateVo;

@Controller
public class Spring_Dispancer {

	@Autowired
	private Dao dao;

	@RequestMapping(value = "index.html", method = RequestMethod.GET)
	public ModelAndView mainMenu() {
		CountryVo countryOb = new CountryVo();
		return new ModelAndView("index");
	}

	@RequestMapping(value = "addcountry.html", method = RequestMethod.GET)
	public ModelAndView addCountry() {
		CountryVo countryOb = new CountryVo();
		return new ModelAndView("addcountry", "countryOb", countryOb);
	}

	@RequestMapping(value = "savecountry.html", method = RequestMethod.POST)
	public ModelAndView saveCountry(@ModelAttribute CountryVo countryOb) {
		dao.insertCountry(countryOb);
		return new ModelAndView("index");
	}

	@RequestMapping(value = "viewstate.html", method = RequestMethod.GET)
	public ModelAndView viewState() {
		List stateList = dao.searchState();
		return new ModelAndView("viewstate", "statelist", stateList);
	}

	@RequestMapping(value = "addstate.html", method = RequestMethod.GET)
	public ModelAndView addState() {
		List countrylist = dao.searchCountry();
		return new ModelAndView("addstate", "stateVo", new StateVo()).addObject("countrylist", countrylist);
	}

	@RequestMapping(value = "saveState.html", method = RequestMethod.POST)
	public ModelAndView saveState(@ModelAttribute StateVo stateOb) {

		if (stateOb.getId()==0) {
			this.dao.insertState(stateOb);
		}else{
			this.dao.insertCountry(stateOb.getCountryOb());
		}
		return new ModelAndView("redirect:/addstate.html");
	}

	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public ModelAndView editInfo(@RequestParam int id) {

		List<CountryVo> ls = dao.edit(id);
		List<CountryVo> countrylist = dao.searchCountry();
		return new ModelAndView("addstate", "StateVo", ls.get(0)).addObject("countrylist", countrylist);
	}

	@RequestMapping(value = "delete.html", method = RequestMethod.GET)
	public ModelAndView deleteState(@RequestParam int id) {

		List<CountryVo> ls = dao.edit(id);
		List<CountryVo> countrylist = dao.searchCountry();
		return new ModelAndView("addstate", "StateVo", ls.get(0)).addObject("countrylist", countrylist);
	}

}
