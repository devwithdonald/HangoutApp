package com.revature.beans;

public class RsvpDTO {
	private int EventID;
	private BasicUser user;
	private Event event;
	private String Status;
	
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public BasicUser getUser() {
		return user;
	}
	public void setUser(BasicUser user) {
		this.user = user;
	}
	public String getStatus() {
		// TODO Auto-generated method stub
		return Status;
	}
	public void setStatus(String status) {
		this.Status = status;
	}
}
