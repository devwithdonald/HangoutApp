package com.revature.dao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	@Override
	public User getUser(User user) {
		log.log(Level.INFO, "in getUserDao");
		User returnedUser;

		Session sess = sf.openSession();
		
		String hql = "From User as u WHERE u.username = :username AND u.password = :password";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		
		try {
			returnedUser = (User) query.getSingleResult();
		} catch (NoResultException e) {
			log.log(Level.INFO, "database returned null");
			return null;
		}
		
		
		log.log(Level.INFO, "database returned: " + returnedUser);
				
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
