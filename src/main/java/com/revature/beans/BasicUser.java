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
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Subscriptions> subscriptions = new HashSet<Subscriptions>();

	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="sender")
	private Set<UserMessage> sentMessages = new HashSet<UserMessage>();
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="receiver")
	private Set<UserMessage> recievedMessages = new HashSet<UserMessage>();
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Rsvp> rsvps = new HashSet<Rsvp>();
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="basicUser")
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
			Set<BasicUser> friendList) {
		super(userId, username, password, role);
		this.firstName = firstName;
		this.lastName = lastName;
		this.friendList = friendList;
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

//	@Override
//	public String toString() {
//		return "BasicUser [firstName=" + firstName + ", lastName=" + lastName + ", friendList=" + friendList
//				+ ", subscriptions=" + subscriptions + ", sentMessages=" + sentMessages + ", recievedMessages="
//				+ recievedMessages + ", rsvps=" + rsvps + ", eventMessages=" + eventMessages + "]";
//	}


	
	
	
}