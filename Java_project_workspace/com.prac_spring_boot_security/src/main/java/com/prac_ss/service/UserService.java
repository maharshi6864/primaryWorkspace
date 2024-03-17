package com.prac_ss.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.prac_ss.models.Users;

@Service
public class UserService {

	List<Users> list = new ArrayList<Users>();

	public UserService() {
		list.add(new Users("Maharshi", "Maharshi7788", "maharshi6864@gmail.com"));
		list.add(new Users("karan", "karan6677", "karan@gmail.com"));
	}

	public List<Users> getAllUsers() {
		return this.list;
	}

	public Users getUser(String username)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}

	public Users addUser(Users user) {
		this.list.add(user);
		return user;
	}
}