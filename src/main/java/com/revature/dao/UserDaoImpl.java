package com.revature.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.revature.beans.BasicUser;
import com.revature.beans.BusinessUser;
import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.beans.UserDTO;
import com.revature.util.SessionFactoryUtil;

@Component
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
//	private ApplicationContext applicationContext;


	@Override
	public User getUser(User user) {
		log.log(Level.INFO, "passing username: " + user.getUsername() + " into getUser() - DAO");
		
		User returnedUser;
		Session sess = sf.openSession();
		
		String hql = "FROM User as u WHERE u.username = :username AND u.password = :password";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		
		try {
			returnedUser = (User) query.getSingleResult();
		} catch (NoResultException e) {
			log.log(Level.WARNING, "database returned null - user not found");
			sess.close();
			return null;
		}
		log.log(Level.INFO, "database returned: " + returnedUser);
				
		sess.close();
		return returnedUser;
	}
	
	@Override
	public Boolean addUser(UserDTO user, String userType) {
		// TODO Auto-generated method stub
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		System.out.println(userType);
		boolean createUser = false;
		try {
		if(userType.equals("BasicUser")) {
			sess.save(new BasicUser(user));
			tx.commit();
			createUser = true;
		}
		else if(userType.equals("BusinessUser")) {
			sess.save(new BusinessUser(user));
			tx.commit();
			createUser = true;
		}
		} catch(Exception e) {
			tx.rollback();
			createUser = false;
		}
		sess.close();
		return createUser;
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

	@Override
	public BasicUser getBasicUserByUsername(String username) {
		Session sess = sf.openSession();
		BasicUser user = null;
		user = sess.get(BasicUser.class, username);
		sess.close();
		return user;
	}
}
