package com.revature.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
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
		log.log(Level.INFO, "getEventById - EventDAO");
		log.log(Level.INFO, "passed id: " + eventId);
		Session sess = sf.openSession();
		Event event = (Event) sess.get(Event.class, eventId);
		log.log(Level.INFO, "Returned Event: " + event);
		sess.close();
		return event;
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
		// set time_posted now
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		event.setTimePosted(dtf.format(now));

		// set on timeline
		event.setOnTimeLine(true);

		log.log(Level.INFO, "in addBusinessPublicEvent - EventDao");
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(event);
		tx.commit();
		sess.close();
		return true;
	}

	@Override
	public Boolean addBusinessPrivateEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateBasicUserEvent(Event event, Event verifiedEvent) {
		log.log(Level.INFO, "updateEvent - EventDaoImpl");

		// setting event information that did not get updated in Angular form
		event.setUser(verifiedEvent.getUser());
		event.setTimePosted(verifiedEvent.getTimePosted());
		event.setOnTimeLine(verifiedEvent.getOnTimeLine());
		event.setBusinessMessage(verifiedEvent.getBusinessMessage());

		log.log(Level.INFO, "updated event we are trying to update to: " + event);

		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		String hql = "UPDATE Event e SET e.title = :title, e.description = :description,"
				+ "e.location = :location, e.timeOfEvent = :timeOfEvent, e.dateOfEvent = :dateOfEvent"
				+ " WHERE e.eventId = :eventId";

		Query query = sess.createQuery(hql);
		log.log(Level.INFO, "after create query statement - EventDaoImpl");

		query.setParameter("title", event.getTitle());
		query.setParameter("description", event.getDescription());
		query.setParameter("location", event.getLocation());
		query.setParameter("timeOfEvent", event.getTimeOfEvent());
		query.setParameter("dateOfEvent", event.getDateOfEvent());
		query.setParameter("eventId", event.getEventId());

		int numberOfRows = query.executeUpdate();
		tx.commit();
		sess.close();
		log.log(Level.INFO, "after execute update statement - EventDaoImpl");

		if (numberOfRows == 1) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Boolean removeEvent(Event event) {
		log.log(Level.INFO, "in removeEvent - EventDao");
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		String hql = "UPDATE Event e SET e.onTimeLine = false WHERE e.eventId = :eventId";
		Query query = sess.createQuery(hql);
		
		log.log(Level.INFO, "after create query statement - EventDaoImpl");
		query.setParameter("eventId", event.getEventId());
		
		int numberOfRows = query.executeUpdate();
		tx.commit();
		sess.close();
		log.log(Level.INFO, "after execute update statement - EventDaoImpl");

		if (numberOfRows == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Boolean sendEventNotificationOut(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllBasicUserEvents() {
		log.log(Level.INFO, "getAllBasicUserEvents - EventDao");
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Event.class).add(Restrictions.eq("onTimeLine", true)).addOrder(Order.desc("timePosted"));
		List<Event> eventList = crit.list();
		log.log(Level.INFO, "grabbing event list: " + eventList);
		
		List<Event> resultList = new ArrayList<>();
		
		for (Event e: eventList) {
			if(!resultList.contains(e)) {
				resultList.add(e);
			}
		}
		
		
		sess.close();
		return resultList;

	}

	@Override
	public List<Event> getAllEventsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllBusinessUserEvents(User user) {
		log.log(Level.INFO, "in getAllBusinessUserEvents - EventDao");
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Event.class);

		crit.add(Restrictions.and(Restrictions.eq("user.userId", user.getUserId()), 
				Restrictions.eq("onTimeLine", true))).addOrder(Order.desc("timePosted"));
		List<Event> eventList = crit.list();

		for (Event event : eventList) {
			System.out.println(event);
		}
		sess.close();
		return eventList;
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
	public Event validateEventForUser(Event event, User user) {
		log.log(Level.INFO, "in validateEventForUser - EventDao");
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Event.class);

		crit.add(Restrictions.and(Restrictions.eq("eventId", event.getEventId()),
				Restrictions.eq("user.userId", user.getUserId())));

		Event returnedEvent = (Event) crit.uniqueResult();

		log.log(Level.INFO, "validateEventForUser returned the event: " + returnedEvent);
		sess.close();

		if (returnedEvent == null) {
			return null;
		} else {
			
			log.log(Level.INFO, "returned event NOT null");
			return returnedEvent;
		}
	}

	@Override
	public Boolean updateBusinessEvent(Event event, Event verifiedEvent) {
		log.log(Level.INFO, "updateBusinessEvent - EventDaoImpl");

		// setting event information that did not get updated in Angular form
		event.setUser(verifiedEvent.getUser());
		event.setTimePosted(verifiedEvent.getTimePosted());
		event.setOnTimeLine(verifiedEvent.getOnTimeLine());

		log.log(Level.INFO, "updated event we are trying to update to: " + event);

		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		String hql = "UPDATE Event e SET e.businessMessage = :businessMessage, e.title = :title, e.description = :description,"
				+ "e.location = :location, e.timeOfEvent = :timeOfEvent, e.dateOfEvent = :dateOfEvent"
				+ " WHERE e.eventId = :eventId";

		Query query = sess.createQuery(hql);
		log.log(Level.INFO, "after create query statement - EventDaoImpl");

		query.setParameter("businessMessage", event.getBusinessMessage());
		query.setParameter("title", event.getTitle());
		query.setParameter("description", event.getDescription());
		query.setParameter("location", event.getLocation());
		query.setParameter("timeOfEvent", event.getTimeOfEvent());
		query.setParameter("dateOfEvent", event.getDateOfEvent());
		query.setParameter("eventId", event.getEventId());

		int numberOfRows = query.executeUpdate();
		tx.commit();
		sess.close();
		log.log(Level.INFO, "after execute update statement - EventDaoImpl");

		if (numberOfRows == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Event> getAllPublicEvents() {
		log.log(Level.INFO, "in get public events - EventDao");
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Event.class).add(Restrictions.eq("onTimeLine", true)).addOrder(Order.asc("eventId"));
		List<Event> publicEventList = crit.list();
		log.log(Level.INFO, "grabbing event list: " + publicEventList);
		sess.close();
		return publicEventList;
	}

}
