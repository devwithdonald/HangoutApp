package com.revature.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public User getUser(User user) {
		//WILL NEED A HQL QUERY!!!!!!!
		
		Session sess = sf.openSession();
		User returnedUser = (User) sess.get(User.class, user);
		return null;
	}

	@Override
	public Boolean addUser(User user, String userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
