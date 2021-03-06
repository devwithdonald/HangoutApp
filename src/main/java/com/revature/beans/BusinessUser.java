package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="BUSINESS_USER")
public class BusinessUser extends User {

	@Column(name="BUSINESS_NAME")
	private String businessName;
	
	@Column(name="BUSINESS_LOCATION")
	private String location;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<BusinessEmployeeUser> employeeList = new HashSet<BusinessEmployeeUser>();
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<BusinessMessage> messageList = new HashSet<BusinessMessage>();
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<Subscriptions> subscriberList = new HashSet<Subscriptions>();

	public BusinessUser() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public BusinessUser(int userId, String username, String password, Role role) {
//		super(userId, username, password, role);
//		// TODO Auto-generated constructor stub
//	}
//
//	public BusinessUser(int userId, String username, String password, Role role, String businessName, String location) {
//		super(userId, username, password, role);
//		this.businessName = businessName;
//		this.location = location;
//	}
//
//	public BusinessUser(UserDTO user) {
//		super(user.getUserId(), user.getUsername(), user.getPassword(), user.getRole());
//		this.businessName = user.getBusinessName();
//		this.location = user.getLocation();
//	}
	
	

	public String getBusinessName() {
		return businessName;
	}

	public BusinessUser(int userId, String username, String password, Role role, Set<User> friendList, String businessName,
		String location) {
	super(userId, username, password, role, friendList);
	this.businessName = businessName;
	this.location = location;
	}
	
	public BusinessUser(UserDTO user) {
		super(user.getUserId(), user.getUsername(), user.getPassword(), user.getRole(), user.getFriendList());
		this.businessName = user.getBusinessName();
		this.location = user.getLocation();
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	@Override
//	public String toString() {
//		return "BusinessUser [businessName=" + businessName + ", location=" + location + ", employeeList="
//				+ employeeList + ", messageList=" + messageList + ", subscriberList=" + subscriberList + "]";
//	}

	
}