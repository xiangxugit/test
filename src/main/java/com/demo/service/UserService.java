package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {
	/**
	 * @see 注册用户
	 * @param user
	 * @return
	 */
	int insertUser(User user);
	/**
	 * 功能：返回用户信息
	 * @return 返回用户信息
	 */
    
	List<User> getAllUser(User user);
	/**
	 * 功能:用户登陆
	 * @param user
	 * @param name
	 * @return
	 */
	User Login(User user);
	

}
