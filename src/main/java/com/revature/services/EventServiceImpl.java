package com.revature.services;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.dao.EventDao;

@Service
public class EventServiceImpl implements EventService {
	

	private EventDao eventDao;
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	
	@Autowired
	private void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	@Override
	public Boolean addBasicUserEvent(Event event) {
		log.log(Level.INFO, "in addBasicUserEvent - EventService");
		return eventDao.addBasicUserEvent(event);
	}

	@Override
	public Boolean addBusinessPublicEvent(Event event) {
		log.log(Level.INFO, "in addBusinessPublicEvent - EventService");
		return eventDao.addBusinessPublicEvent(event);
	}

	@Override
	public Boolean addBusinessPrivateEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean updateBasicUserEvent(Event event, Event verifiedEvent) {
		return eventDao.updateBasicUserEvent(event, verifiedEvent);
	}

	@Override
	public Boolean updateBusinessEvent(Event event, Event verifiedEvent) {
		return eventDao.updateBusinessEvent(event, verifiedEvent);
	}

	@Override
	public Boolean removeEvent(Event event) {
		return eventDao.removeEvent(event);
	}

	@Override
	public Boolean sendEventNotificationOut(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllBasicUserEvents() {
		log.log(Level.INFO, "in getAllBasicUserEvents - EventService");
		List<Event> eventList = eventDao.getAllBasicUserEvents();
		Collections.reverse(eventList);
		return eventList;
	}

	@Override
	public Event getEventByEventId(int id) {
		return eventDao.getEventByEventId(id);
	}

	@Override
	public List<Event> getAllEventsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllBusinessUserEvents(User user) {
		log.log(Level.INFO, "in getAllBusinessUserEvents - EventService");
		List<Event> eventList = eventDao.getAllBusinessUserEvents(user);
		Collections.reverse(eventList);
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
		return eventDao.validateEventForUser(event, user);
	}

	@Override
	public List<Event> getAllPublicEvents() {
		return eventDao.getAllPublicEvents();
	}

}
