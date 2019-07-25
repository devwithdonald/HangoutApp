package com.revature.beans;

public class RsvpDTO {
	private int eventId;
	private BasicUser user;
	private User user1;
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	private Event event;
	private String status;
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
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
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
