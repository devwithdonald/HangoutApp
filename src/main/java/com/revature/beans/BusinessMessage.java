package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="businessMessage")
	private Set<BusinessEmployeeUser> employeeMessageList = new HashSet<BusinessEmployeeUser>();

	public BusinessMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
		// TODO Auto-generated constructor stub
	}

	public BusinessMessage(BusinessUser businessUser, Event event, Set<BusinessMessage> messageList) {
		super();
		this.businessUser = businessUser;
		this.event = event;
		this.messageList = messageList;
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

	public Set<BusinessMessage> getMessageList() {
		return messageList;
	}

	public void setMessageList(Set<BusinessMessage> messageList) {
		this.messageList = messageList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((businessUser == null) ? 0 : businessUser.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((messageList == null) ? 0 : messageList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessMessage other = (BusinessMessage) obj;
		if (businessUser == null) {
			if (other.businessUser != null)
				return false;
		} else if (!businessUser.equals(other.businessUser))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (messageList == null) {
			if (other.messageList != null)
				return false;
		} else if (!messageList.equals(other.messageList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusinessMessage [businessUser=" + businessUser + ", event=" + event + ", messageList=" + messageList
				+ "]";
	}
}