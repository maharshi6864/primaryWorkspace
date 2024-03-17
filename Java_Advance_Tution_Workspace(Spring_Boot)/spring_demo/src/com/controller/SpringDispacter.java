package com.controller;


import javax.servlet.http.HttpServletRequest;

import com.vo.Vo;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.fabric.Response;

@Controller
public class SpringDispacter {

	
	@RequestMapping(value="h.html",method = RequestMethod.GET)
	public ModelAndView load()
	{
		String message="Hello this side ";
		return new ModelAndView("w","msg",message);
	}
	
	@RequestMapping(value="f.html",method = RequestMethod.GET)
	public ModelAndView loadForm()
	{

		return new ModelAndView("register");
	}
	
	@RequestMapping(value="resp.html",method = RequestMethod.GET)
	public ModelAndView register(HttpServletRequest request)
	{
		HttpSession s=request.getSession();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String	username=request.getParameter("username");
		String password=request.getParameter("password");
		s.setAttribute("firstname", firstname);
		s.setAttribute("lastname", lastname);
		s.setAttribute("username", username);
		s.setAttribute("password", password);
		return new ModelAndView("login");
	}
	@RequestMapping(value="check.html",method = RequestMethod.GET)
	public ModelAndView check(HttpServletRequest request)
	{
		HttpSession s=request.getSession();
		String	username=request.getParameter("username");
		String password=request.getParameter("password");
		String usernamer=(String) s.getAttribute("username");
		String passwordr=(String) s.getAttribute("password");
		String firstname=(String)s.getAttribute("firstname");
		String lastname=(String)s.getAttribute("lastname");
		if(username.equals(usernamer)&&password.equals(passwordr)){
			return new ModelAndView("welcome","firsstname",firstname).addObject("lastname",lastname);
		}
		return new ModelAndView("login");
	}
	@RequestMapping(value="j.html",method = RequestMethod.GET)
	public ModelAndView from2()
	{
		return new ModelAndView("register2","obj",new Vo());
	}
	
	@RequestMapping(value="login.html",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Vo v,HttpServletRequest request)
	{
		HttpSession s=request.getSession();
		s.setAttribute("register", v);
		return new ModelAndView("login2","logobj",new Vo());
	}
	@RequestMapping(value="check2.html",method = RequestMethod.POST)
	public ModelAndView  check2(@ModelAttribute Vo v,HttpServletRequest request)
	{
		HttpSession s=request.getSession();
		Vo regobj=(Vo)s.getAttribute("register");
		if (regobj.getUsername().equals(v.getUsername())&&regobj.getPassword().equals(v.getPassword())) {
			return new ModelAndView("welcome","regobj",regobj);
		}
		return new ModelAndView("login2","logobj",new Vo());
	}
	
	

	
	
//	@ResponseBody(value="resp.html",method=Response)
//	public ModelAndView reposn(){
//		
//	}
}
