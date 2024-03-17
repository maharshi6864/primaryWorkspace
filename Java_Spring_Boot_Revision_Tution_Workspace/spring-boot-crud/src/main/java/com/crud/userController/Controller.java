package com.crud.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crud.userService.UserServices;
import com.crud.userVo.UserVo;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	public UserServices userService;

	@GetMapping(value = "/")
	public ModelAndView welcome() {
		return new ModelAndView("hello");
	}

	@GetMapping(value = "/insertUser")
	public ModelAndView insertUser() {
		return new ModelAndView("insertUser", "userVo", new UserVo());
	}

	@PostMapping(value = "/registerUser")
	public ModelAndView registerUser(@ModelAttribute UserVo userVo) {
		this.userService.insertUser(userVo);
		return new ModelAndView("insertUser", "userVo", new UserVo());
	}

	@GetMapping(value = "/searchUser")
	public ModelAndView searchUser() {
		List<UserVo> userList = this.userService.searchUser();
		return new ModelAndView("searchUser", "searchList", userList);
	}

	@GetMapping(value = "/edit")
	public ModelAndView editUser(@RequestParam int id) {
		List<UserVo> userList = this.userService.findById(id);
		UserVo editUserObj = userList.get(0);
		return new ModelAndView("insertUser", "userVo", editUserObj);
	}

	@GetMapping(value = "/delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		this.userService.deleteUser(id);
		return new ModelAndView("redirect:/searchUser");
	}
}
