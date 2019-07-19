package com.revature.services;

import java.util.List;

import com.revature.beans.User;

public interface UserService {
		
	//will need 3 different User DAOs to check  
	public User validateUser(User user);

	public Boolean addUser(User user, String userType);

	public Boolean updateUser(User user);
	
	public List<User> getAllUsers();
}