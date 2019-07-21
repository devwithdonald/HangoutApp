package com.revature.dao;

import java.util.List;

import com.revature.beans.BasicUser;
import com.revature.beans.User;
import com.revature.beans.UserDTO;

public interface UserDao {

	public User getUser(User user);

	public Boolean addUser(UserDTO user, String userType);
	
	public User getUser(String username);

	public List<User> getAllUsers();
	
	public List<User> getAllFriends(BasicUser user);
	
	public Boolean addFriend(User user, String username);
	
	public Boolean removeFriend(User user, String username);

}