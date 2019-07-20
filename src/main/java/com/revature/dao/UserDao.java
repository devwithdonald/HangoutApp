package com.revature.dao;

import java.util.List;

import com.revature.beans.User;
import com.revature.beans.UserDTO;

public interface UserDao {

	public User getUser(User user);

	public Boolean addUser(UserDTO user, String userType);

	public List<User> getAllUsers();

}