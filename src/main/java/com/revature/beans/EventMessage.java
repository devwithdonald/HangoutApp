package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EVENT_MESSAGES")
public class EventMessage extends Message {
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="EVENT_ID")
	private Event event;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="SENDER_ID")
	private BasicUser basicUser;

	public EventMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
		// TODO Auto-generated constructor stub
	}

	public EventMessage(Event event, BasicUser basicUser) {
		super();
		this.event = event;
		this.basicUser = basicUser;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public BasicUser getBasicUser() {
		return basicUser;
	}

	public void setBasicUser(BasicUser basicUser) {
		this.basicUser = basicUser;
	}

//	@Override
//	public String toString() {
//		return "EventMessage [event=" + event + ", basicUser=" + basicUser + "]";
//	}
	

	
}