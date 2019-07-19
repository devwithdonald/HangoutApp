package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.beans.BasicUser;
import com.revature.beans.BusinessEmployeeUser;
import com.revature.beans.BusinessMessage;
import com.revature.beans.BusinessUser;
import com.revature.beans.Event;
import com.revature.beans.EventMessage;
import com.revature.beans.Message;
import com.revature.beans.Role;
import com.revature.beans.Rsvp;
import com.revature.beans.Subscriptions;
import com.revature.beans.User;
import com.revature.beans.UserMessage;
import com.revature.dao.UserDaoImpl;

public class SessionFactoryUtil {
	
	private static SessionFactory sf;
	
	static {
		Configuration configuration = new Configuration().configure();
		//TODO need to update the environment through jenkins
		configuration.setProperty("hibernate.connection.username", System.getenv("HANGOUT_USERNAME"));
		configuration.setProperty("hibernate.connection.password", System.getenv("HANGOUT_PASSWORD")); 
		configuration.setProperty("hibernate.connection.url", 
				"jdbc:postgresql://" + System.getenv("HANGOUT_URL") + ":5432/glory_1905java?");
		
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties()).build();
//		sf = configuration.buildSessionFactory(serviceRegistry);
		
		
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(BasicUser.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(BusinessEmployeeUser.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(BusinessMessage.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(BusinessUser.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Event.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(EventMessage.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Message.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Role.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Rsvp.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Subscriptions.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(UserMessage.class).buildSessionFactory();
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	
		sf = configuration.configure("hibernate.cfg.xml").addAnnotatedClass(UserDaoImpl.class).buildSessionFactory();

	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}


}