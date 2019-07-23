package com.revature.services;

import java.util.List;

import com.revature.beans.Event;
import com.revature.beans.User;

public interface EventService {

	public Boolean addBasicUserEvent(Event event);
	
	public Boolean addBusinessPublicEvent(Event event);
	
	public Boolean addBusinessPrivateEvent(Event event);
	
	public Boolean updateBasicUserEvent(Event event, Event verifiedEvent);
	
	public Boolean updateBusinessEvent(Event event, Event verifiedEvent);
	
	public Boolean removeEvent(Event event);
	
	public Boolean sendEventNotificationOut(Event event);
	
	public List<Event> getAllBasicUserEvents();
	
	public Event getEventByEventId(int id);
	
	/* We will be able to check business events here also 
	 * We will need to do an 'instanceof' type check
	 * to send to the correct DAO */
	public List<Event> getAllEventsByUser(User user);
	
	public List<Event> getAllBusinessUserEvents(User user);
	
	public List<Event> getAllFriendEventsByUser(User user);
	
	public List<Event> getAllSubscribedEventsByUser(User user);
	
	public List<Event> viewSummaryOfSubscribedBusinessEvents(User user);
	
	public Event validateEventForUser(Event event, User user);
	
}
