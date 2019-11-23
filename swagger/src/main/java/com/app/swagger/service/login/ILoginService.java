package com.app.swagger.service.login;

import com.app.swagger.model.User;

public interface ILoginService {
	
	/*用户登录
	 * @param user
	 * @return user
	 * */
	public User login(User user);

}
