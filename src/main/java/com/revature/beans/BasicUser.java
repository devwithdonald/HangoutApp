package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="BASIC_USER")
public class BasicUser extends User{
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	//FIX BROTHER
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="FRIENDS",
			joinColumns=@JoinColumn(name="USER_ID"),
			inverseJoinColumns=@JoinColumn(name="FRIEND_ID"))
	private Set<BasicUser> friendList;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Subscriptions> subscriptions = new HashSet<Subscriptions>();

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="sender")
	private Set<UserMessage> sentMessages = new HashSet<UserMessage>();
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="receiver")
	private Set<UserMessage> recievedMessages = new HashSet<UserMessage>();
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Rsvp> rsvps = new HashSet<Rsvp>();
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<EventMessage> eventMessages = new HashSet<EventMessage>();

	public BasicUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasicUser(int userId, String username, String password, Role role) {
		super(userId, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public BasicUser(int userId, String username, String password, Role role, String firstName, String lastName,
			Set<BasicUser> friendList, Set<Subscriptions> subscriptions, Set<UserMessage> sentMessages,
			Set<UserMessage> recievedMessages, Set<Rsvp> rsvps, Set<EventMessage> eventMessages) {
		super(userId, username, password, role);
		this.firstName = firstName;
		this.lastName = lastName;
		this.friendList = friendList;
		this.subscriptions = subscriptions;
		this.sentMessages = sentMessages;
		this.recievedMessages = recievedMessages;
		this.rsvps = rsvps;
		this.eventMessages = eventMessages;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<BasicUser> getFriendList() {
		return friendList;
	}

	public void setFriendList(Set<BasicUser> friendList) {
		this.friendList = friendList;
	}

	public Set<Subscriptions> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Set<Subscriptions> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public Set<UserMessage> getSentMessages() {
		return sentMessages;
	}

	public void setSentMessages(Set<UserMessage> sentMessages) {
		this.sentMessages = sentMessages;
	}

	public Set<UserMessage> getRecievedMessages() {
		return recievedMessages;
	}

	public void setRecievedMessages(Set<UserMessage> recievedMessages) {
		this.recievedMessages = recievedMessages;
	}

	public Set<Rsvp> getRsvps() {
		return rsvps;
	}

	public void setRsvps(Set<Rsvp> rsvps) {
		this.rsvps = rsvps;
	}

	public Set<EventMessage> getEventMessages() {
		return eventMessages;
	}

	public void setEventMessages(Set<EventMessage> eventMessages) {
		this.eventMessages = eventMessages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((eventMessages == null) ? 0 : eventMessages.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((friendList == null) ? 0 : friendList.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((recievedMessages == null) ? 0 : recievedMessages.hashCode());
		result = prime * result + ((rsvps == null) ? 0 : rsvps.hashCode());
		result = prime * result + ((sentMessages == null) ? 0 : sentMessages.hashCode());
		result = prime * result + ((subscriptions == null) ? 0 : subscriptions.hashCode());
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
		BasicUser other = (BasicUser) obj;
		if (eventMessages == null) {
			if (other.eventMessages != null)
				return false;
		} else if (!eventMessages.equals(other.eventMessages))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (friendList == null) {
			if (other.friendList != null)
				return false;
		} else if (!friendList.equals(other.friendList))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (recievedMessages == null) {
			if (other.recievedMessages != null)
				return false;
		} else if (!recievedMessages.equals(other.recievedMessages))
			return false;
		if (rsvps == null) {
			if (other.rsvps != null)
				return false;
		} else if (!rsvps.equals(other.rsvps))
			return false;
		if (sentMessages == null) {
			if (other.sentMessages != null)
				return false;
		} else if (!sentMessages.equals(other.sentMessages))
			return false;
		if (subscriptions == null) {
			if (other.subscriptions != null)
				return false;
		} else if (!subscriptions.equals(other.subscriptions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BasicUser [firstName=" + firstName + ", lastName=" + lastName + ", friendList=" + friendList
				+ ", subscriptions=" + subscriptions + ", sentMessages=" + sentMessages + ", recievedMessages="
				+ recievedMessages + ", rsvps=" + rsvps + ", eventMessages=" + eventMessages + "]";
	}
	
	
	
}