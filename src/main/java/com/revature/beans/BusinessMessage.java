package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BUSINESS_MESSAGES")
public class BusinessMessage extends Message {
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private BusinessUser businessUser;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="EVENT_ID")
	private Event event;

	public BusinessMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
		// TODO Auto-generated constructor stub
	}

	public BusinessMessage(BusinessUser businessUser, Event event) {
		super();
		this.businessUser = businessUser;
		this.event = event;
	}

	public BusinessUser getBusinessUser() {
		return businessUser;
	}

	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "BusinessMessage [businessUser=" + businessUser + ", event=" + event + "]";
	}
	

}