package com.revature.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		// set time_posted now
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		event.setTimePosted(dtf.format(now));

		// set on timeline
		event.setOnTimeLine(true);

		log.log(Level.INFO, "in addBasicUserEvent - EventDao");
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(event);
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
		// HQL QUERY NEEDED
		Session sess = sf.openSession();
		String hql = "UPDATE Event e SET e.title = :title, e.description = :description,"
				+ "e.location = :location, e.timeOfEvent = :timeOfEvent, e.dateOfEvent = :dateOfEvent"
				+ " WHERE e.eventId = :eventId";
		
		Query query = sess.createQuery(hql);
		query.setParameter("title", event.getTitle());
		query.setParameter("description", event.getDescription());
		query.setParameter("location", event.getLocation());
		query.setParameter("timeOfEvent", event.getTimeOfEvent());
		query.setParameter("dateOfEvent", event.getDateOfEvent());
		int numberOfRows = query.executeUpdate();
		
		if (numberOfRows == 1) {
			return true;
		} else {
			return false;
		}

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
	public List<Event> getAllBasicUserEvents() {
		log.log(Level.INFO, "in getAllBasicUserEvents - EventDao");
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Event.class);
		List<Event> eventList = crit.list();
		//
		for (Event event : eventList) {
			System.out.println(event);
		}
		sess.close();
		return eventList;
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

	@Override
	public boolean validateEventForUser(Event event, User user) {
		log.log(Level.INFO, "in validateEventForUser - EventDao");
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Event.class);

		crit.add(Restrictions.and(Restrictions.eq("eventId", event.getEventId()),
				Restrictions.eq("user.userId", user.getUserId())));

		if (crit.uniqueResult() == null) {
			return false;
		} else {
			return true;
		}
	}

}
