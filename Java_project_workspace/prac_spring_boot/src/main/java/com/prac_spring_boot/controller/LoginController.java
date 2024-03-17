package com.prac_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prac_spring_boot.model.LoginModel;

@Controller
public class LoginController {

	@GetMapping(value = "/")
	public ModelAndView login() {
		return new ModelAndView("login/login", "LoginVo", new LoginModel());
	}
}
