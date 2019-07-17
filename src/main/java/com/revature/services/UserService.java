package com.revature.services;

import com.revature.beans.User;

public interface UserService {
	
	//will need 3 different User DAOs to check  
	public User getUserByUsernameAndPassword(String username, String password);

	public Boolean addUser(User user, String userType);

	public Boolean updateUser(User user);
}