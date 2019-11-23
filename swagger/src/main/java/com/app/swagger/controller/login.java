package com.app.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.swagger.model.User;

@RestController
public class login {
	
	@GetMapping("/login")
	public User getLogin(User user) {
		return user;
	}
	
	@PostMapping("/login")
	public User postLogin(@RequestBody User user) {
		return user;
	}
}
