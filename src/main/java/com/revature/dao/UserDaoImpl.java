package com.revature.dao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	@Override
	public User getUser(User user) {
		log.log(Level.INFO, "in getUserDao");

		Session sess = sf.openSession();
		
		String hql = "From User as u WHERE u.username = :username AND u.password = :password";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		
		User returnedUser = (User) query.getSingleResult();
		
		log.log(Level.INFO, "Database returned: " + returnedUser);
				
		return returnedUser;
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
