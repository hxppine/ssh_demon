package com.hxp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hxp.dao.UserDao;
import com.hxp.model.User;

@Component
public class UserService {
	
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public User loadUser(User u){
		return this.userDao.getUser(u);
	}
}
