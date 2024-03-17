package com.prac_ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class NewController {

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello this is hello world string";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "Hello this is login page string";
    }

    @GetMapping(value = "/register")
    public String register() {
        return "Hello this is register string";
    }
}
