package com.app.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.swagger.model.User;

@RestController
public class controller {
	@GetMapping("/getUser")
	public User getUser() {
		return new User();
	}
}
