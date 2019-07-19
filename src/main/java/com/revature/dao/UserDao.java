package com.revature.dao;

import java.util.List;

import com.revature.beans.User;

public interface UserDao {

	public User getUser(User user);

	public Boolean addUser(User user, String userType);

	public List<User> getAllUsers();

}