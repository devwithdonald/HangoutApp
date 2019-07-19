package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Criteria;
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
		log.log(Level.INFO, "user = " + user);
		log.log(Level.INFO, "user username = " + user.getUsername());
		log.log(Level.INFO, "user password = " + user.getPassword());
		
		User returnedUser;
		Session sess = sf.openSession();
		
		String hql = "FROM User as u WHERE u.username = :username AND u.password = :password";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		
		try {
			returnedUser = (User) query.getSingleResult();
			log.log(Level.INFO, "ReturnedUser: " + returnedUser);
		} catch (NoResultException e) {
			log.log(Level.WARNING, "database returned null - user not found");
			return null;
		}
		
		
		log.log(Level.INFO, "database returned: " + returnedUser);
				
		return returnedUser;
	}
	
	//HERE
	public List<User> getAllUsers1() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(User.class);
		List<User> result = crit.list();
		System.out.println("result pulled from database 1" + result);
		sess.close();
		System.out.println("result pulled from database 2" + result);
		return result;
	}
	
	public User getUser1() {
		log.log(Level.INFO, "in getUserDao");
		User returnedUser = null;

		Session sess = sf.openSession();
		
		String hql = "From User as u WHERE u.username = :username";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("username", "test_user1");
		//query.setParameter("password", "test1");
		
//		try {
//			returnedUser = (User) query.getSingleResult();
//		} catch (NoResultException e) {
//			log.log(Level.INFO, "database returned null");
//			return null;
//		}
		
		
		//log.log(Level.INFO, "database returned: " + returnedUser);
				
		return returnedUser;
	}

	@Override
	public Boolean addUser(User user, String userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAllUsers() {

		return null;
	}
	
//	public static void main(String[] args) {
//		UserDaoImpl usi = new UserDaoImpl();
//		usi.getUser1();
//	}

}
