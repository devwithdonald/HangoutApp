package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {

	private UserDaoImpl userDao;
	
	@Autowired
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User validateUser(User user) {
		return userDao.getUser(user);
	}

	@Override
	public Boolean addUser(User user, String userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = userDao.getAllUsers1();
		System.out.println("in service, returned list: " + userList);
		return userList;
	}

}
