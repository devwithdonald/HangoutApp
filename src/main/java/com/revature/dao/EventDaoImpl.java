package com.revature.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class EventDaoImpl implements EventDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");


	@Override
	public Event getEventByEventId(Integer eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllEventsByEventType(String eventType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addBasicUserEvent(Event event) {
		log.log(Level.INFO, "in addBasicUserEvent - EventDao");
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.saveOrUpdate(event);
		tx.commit();
		sess.close();
		return true;
	}

	@Override
	public Boolean addBusinessPublicEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addBusinessPrivateEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendEventNotificationOut(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllUserEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllEventsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllBusinessEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllFriendEventsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllSubscribedEventsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> viewSummaryOfSubscribedBusinessEvents(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}