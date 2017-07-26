package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDAO;
import com.demo.model.User;
import com.demo.service.UserService;
 
 
 
@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;
     
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDAO.insertUser(user);
    }



	@Override
	public List<User> getAllUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.getAllUser();
	}

	@Override
	public User Login(User user) {
		// TODO Auto-generated method stub
		return userDAO.Login(user);
//		return null;
	}






 
}