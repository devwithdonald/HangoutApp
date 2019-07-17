package com.revature.dao;

import java.util.List;

import com.revature.beans.Event;
import com.revature.beans.EventMessage;

public interface EventMessageDao {
	
	public void addEventMessage(EventMessage eventmessage);
	
	public EventMessage getEventMessageByID(int eventmessageid);
	
	public List<EventMessage> getEventMessagesByEvent(Event event);
	

}