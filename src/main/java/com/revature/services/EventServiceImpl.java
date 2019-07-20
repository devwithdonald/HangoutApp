package com.revature.services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.dao.EventDaoImpl;

@Service
public class EventServiceImpl implements EventService {
	
	private EventDaoImpl eventDao;
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	@Autowired
	private void setEventDao(EventDaoImpl eventDao) {
		this.eventDao = eventDao;
	}

	@Override
	public Boolean addBasicUserEvent(Event event) {
		log.log(Level.INFO, "in addBasicUserEvent - EventService");
		return eventDao.addBasicUserEvent(event);
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
	public Event getEventByEventId(int id) {
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
