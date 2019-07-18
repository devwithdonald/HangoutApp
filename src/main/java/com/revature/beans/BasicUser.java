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


@Entity
@Table(name="BASIC_USER")
public class BasicUser extends User{
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	//TODO this may be wrong
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="FRIENDS",
			joinColumns=@JoinColumn(name="USER_ID"),
			inverseJoinColumns=@JoinColumn(name="USER_ID"))
	private Set<Friends> friendList;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="basicFriendUser")
//	private Set<Friends> friendList = new HashSet<Friends>();
//	

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

	public BasicUser(int userId, String username, String password, Role role, String firstName, String lastName,
			Set<Friends> friendList, Set<Subscriptions> subscriptions) {
		super(userId, username, password, role);
		this.firstName = firstName;
		this.lastName = lastName;
		this.friendList = friendList;
		this.subscriptions = subscriptions;
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

	public Set<Friends> getFriendList() {
		return friendList;
	}

	public void setFriendList(Set<Friends> friendList) {
		this.friendList = friendList;
	}

	public Set<Subscriptions> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Set<Subscriptions> subscriptions) {
		this.subscriptions = subscriptions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((friendList == null) ? 0 : friendList.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
				+ ", subscriptions=" + subscriptions + "]";
	}
	

	
}