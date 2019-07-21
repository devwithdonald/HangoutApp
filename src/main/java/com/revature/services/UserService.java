package com.revature.services;

import java.util.List;

import com.revature.beans.BasicUser;
import com.revature.beans.User;
import com.revature.beans.UserDTO;

public interface UserService {
		
	//will need 3 different User DAOs to check  
	public User validateUser(User user);

	public boolean addUser(UserDTO user, String userType);

	public Boolean updateUser(User user);
	
	public List<User> getAllUsers();
	
	public List<User> getAllFriends(BasicUser user);
}