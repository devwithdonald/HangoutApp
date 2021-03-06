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

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="BASIC_USER")
public class BasicUser extends User{
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
		
	@JsonIgnore
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Subscriptions> subscriptions = new HashSet<Subscriptions>();

	@JsonIgnore
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="sender")
	private Set<UserMessage> sentMessages = new HashSet<UserMessage>();
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="receiver")
	private Set<UserMessage> recievedMessages = new HashSet<UserMessage>();
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Rsvp> rsvps = new HashSet<Rsvp>();
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<EventMessage> eventMessages = new HashSet<EventMessage>();

	public BasicUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BasicUser(int userId, String username, String password, Role role, Set<User> friendList) {
		super(userId, username, password, role, friendList);
		// TODO Auto-generated constructor stub
	}
	
	public BasicUser(UserDTO userDTO) {
		super(userDTO.getUserId(), userDTO.getUsername(), userDTO.getPassword(), userDTO.getRole(), userDTO.getFriendList());
		this.firstName = userDTO.getFirstName();
		this.lastName = userDTO.getLastName();
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

	
	
}