package com.revature.dao;

import java.beans.Beans;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
	
	@SuppressWarnings("finally")
	@Override
	public Boolean addUser(UserDTO user, String userType) {
		// TODO Auto-generated method stub
		Session sess = sf.openSession();
		ApplicationContext ct=new AnnotationConfigApplicationContext("beans.xml");
		Transaction tx = sess.beginTransaction();
		System.out.println(userType);
		boolean createUser = false;
		BasicUser basicUser1 = (BasicUser) ct.getBean("basicUser");
		basicUser1.setFirstName(user.getFirstName());
		basicUser1.setLastName(user.getLastName());
		basicUser1.setPassword(user.getPassword());
		basicUser1.setUsername(user.getUsername());
		basicUser1.setRole(user.getRole());
		System.out.println(basicUser1.toString());
		sess.save(basicUser1);
		createUser = true;
		tx.commit();
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
}
