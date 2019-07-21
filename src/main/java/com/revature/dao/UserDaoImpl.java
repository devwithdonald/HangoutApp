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
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.revature.beans.BasicUser;
import com.revature.beans.BusinessUser;
import com.revature.beans.User;
import com.revature.beans.UserDTO;
import com.revature.util.SessionFactoryUtil;

@Component
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

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
			BasicUser basicUser1 = new BasicUser();
			basicUser1.setFirstName(user.getFirstName());
			basicUser1.setLastName(user.getLastName());
			basicUser1.setPassword(user.getPassword());
			basicUser1.setUsername(user.getUsername());
			basicUser1.setRole(user.getRole());
			sess.save(basicUser1);
			tx.commit();
			createUser = true;
		}
		else if(userType.equals("BusinessUser")) {
			BusinessUser businessUser = new BusinessUser();
			businessUser.setBusinessName(user.getBusinessName());
			businessUser.setLocation(user.getLocation());
			businessUser.setPassword(user.getPassword());
			businessUser.setUsername(user.getUsername());
			businessUser.setRole(user.getRole());
			sess.save(businessUser);
			tx.commit();
			createUser = true;
		}
		} catch(Exception e) {
			tx.rollback();
			createUser = false;
		}
		return createUser;
	}

	@Override
	public List<User> getAllUsers() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(User.class);
		List<User> result = crit.list();
		sess.close();
		return result;
	}

	@Override
	public List<User> getAllFriends(BasicUser user) {
		log.log(Level.INFO, "passing username: " + user.getUsername() + " into getUser() - DAO");
		
		List<User> returnedUser = null;
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(User.class).add(Restrictions.eq("userId", user.getUserId()));
		
		try {
			
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
	public Boolean addFriend(User user, String username) {
		User user2 = getUser(username);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		String sqlString = "insert into friends(user_id, friend_id) values (?, ?);";
		Query query = sess.createNativeQuery(sqlString);
		query.setParameter(1, user.getUserId());
		query.setParameter(2, user2.getUserId());
		try {
			query.executeUpdate();
			tx.commit();
			return true;
		}catch (Exception e) {
			tx.rollback();
			return false;
		}
	}

	@Override
	public Boolean removeFriend(User user, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String username) {
		User returnedUser = null;
		Session sess = sf.openSession();
		
		String hql = "FROM User as u WHERE u.username = :username";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("username", username);
		try {
			returnedUser = (User) query.getSingleResult();
		} catch (NoResultException e) {
			log.log(Level.WARNING, "database returned null - user not found");
			sess.close();
			return returnedUser;
		}
		log.log(Level.INFO, "database returned: " + returnedUser);
		
		
		return null;
	}
}
