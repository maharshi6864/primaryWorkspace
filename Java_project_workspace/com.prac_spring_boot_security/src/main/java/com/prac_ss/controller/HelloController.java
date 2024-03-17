package com.prac_ss.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac_ss.models.Users;
import com.prac_ss.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class HelloController {

    @Autowired
    UserService userservice;

    @GetMapping(value = "/users")
    public List<Users> getAllUsers() {
        return this.userservice.getAllUsers();
    }

    @GetMapping(value = "/users/{username}")
    public Users getAllUser(@PathVariable("username") String username) {
        return this.userservice.getUser(username);
    }

    @PostMapping(value = "/insertUser")
    public Users registerUser(@RequestBody Users user) {
        this.userservice.addUser(user);
        return user;
    }
}
