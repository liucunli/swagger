package com.app.swagger.service.login.impl;

import com.app.swagger.model.User;
import com.app.swagger.service.login.ILoginService;

public class loginBean implements ILoginService{

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getAge());
		System.out.println(user.getName());
		return user;
	}
	

}
