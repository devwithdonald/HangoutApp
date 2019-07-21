package com.revature.dao;

import java.util.List;

import com.revature.beans.Event;
import com.revature.beans.User;

public interface EventDao {
	
	public Event getEventByEventId(Integer eventId);
	
	public List<Event> getAllEventsByEventType(String eventType);
	
	public Boolean addBasicUserEvent(Event event);

	public Boolean addBusinessPublicEvent(Event event);

	public Boolean addBusinessPrivateEvent(Event event);

	public Boolean updateEvent(Event event, Event verifiedEvent);

	public Boolean removeEvent(Event event);

	public Boolean sendEventNotificationOut(Event event);
	
	public List<Event> getAllBasicUserEvents();
	
	public List<Event> getAllEventsByUser(User user);
	
	public List<Event> getAllBusinessEvents();
	
	public List<Event> getAllFriendEventsByUser(User user);
	
	public List<Event> getAllSubscribedEventsByUser(User user);
	
	public List<Event> viewSummaryOfSubscribedBusinessEvents(User user);
	
	public boolean validateEventForUser(Event event, User user);
	
}