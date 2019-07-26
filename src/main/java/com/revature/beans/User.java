package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name="USERS")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="user")
	private Set<Event> events = new HashSet<Event>();
	
	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ROLE_ID")
    private Role role;
	

	@ManyToMany(fetch=FetchType.EAGER, cascade = {CascadeType.MERGE})
	@JoinTable(name="FRIENDS",
			joinColumns=@JoinColumn(name="USER_ID"),
			inverseJoinColumns=@JoinColumn(name="FRIEND_ID"))
	@JsonIgnoreProperties("friendList")  
	private Set<User> friendList;
	

	public Set<User> getFriendList() {
		return friendList;
	}

	public void setFriendList(Set<User> friendList) {
		this.friendList = friendList;
	}

	public User(int userId, String username, String password, Role role, Set<User> friendList) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.friendList = friendList;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	@Autowired
	public void setRole(Role role) {
		this.role = role;
	}

//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
//				+ ", friendList=" + friendList + "]";
//	}

	

}
