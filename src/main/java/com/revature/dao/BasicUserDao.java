package com.revature.dao;

import java.util.ArrayList;

import com.revature.beans.User;

public interface BasicUserDao {

	public User getBasicUserByUsernameAndPassword(String username, String password);

	public Boolean addBasicUser(User user);

	public ArrayList<User> getAllBasicUsers();

}