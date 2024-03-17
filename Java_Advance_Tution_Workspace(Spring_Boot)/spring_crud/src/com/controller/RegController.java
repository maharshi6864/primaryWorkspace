package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Dao;
import com.vo.LoginVo;
import com.vo.RegisterVo;

@Controller
public class RegController {

	@Autowired
	private Dao regDAO;

	@RequestMapping(value = "register.html", method = RequestMethod.GET)
	public ModelAndView loadRegisterForm() {
		return new ModelAndView("Register", "register", new RegisterVo());
	}

	@RequestMapping(value = "save.html", method = RequestMethod.POST)
	public ModelAndView saveRegisterInfo(@ModelAttribute RegisterVo v) {
		String username=v.getLoginOb().getUsername();
		String password=v.getLoginOb().getPassword();

		LoginVo l=new LoginVo();
		l.setPassword(password);
		l.setUsername(username);
		regDAO.insertLogin(l);
		
		v.setLoginOb(l);
		regDAO.insert(v);
		
		return new ModelAndView("redirect:register.html");
	}

	@RequestMapping(value = "search.html", method = RequestMethod.GET)
	public ModelAndView searchRegister() {
		List searchList = new ArrayList<>();
		searchList = regDAO.search();
		return new ModelAndView("view", "searchlist", searchList);
	}

	@RequestMapping(value = "delete.html", method = RequestMethod.GET)
	public ModelAndView deleteInfo(@RequestParam int id) {
		RegisterVo registerVo = new RegisterVo();
		registerVo.setId(id);
		
		List ls=regDAO.edit(id);
		RegisterVo registerOb=(RegisterVo)ls.get(0);
		int loginId=registerOb.getLoginOb().getId();
		
		
		LoginVo loginVo=new LoginVo();
		loginVo.setId(loginId);
		regDAO.delete(registerVo);
		regDAO.deleteLogin(loginVo);

		return new ModelAndView("redirect:search.html");
	}

	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public ModelAndView editInfo(@RequestParam int id) {

		List ls = regDAO.edit(id);
		return new ModelAndView("Register", "register", ls.get(0));
	}

}
