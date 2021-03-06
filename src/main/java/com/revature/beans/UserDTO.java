package com.revature.beans;

import java.util.Set;

public class UserDTO {
	private int userId;
	private String firstName;
	private String lastName;
	private String businessName;
	private String location;
	private String username;
	private String password;
	private Role role;
	private BusinessUser businessUser;
	private Set<User> friendList;
	
	public Set<User> getFriendList() {
		return friendList;
	}
	public void setFriendList(Set<User> friendList) {
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
	public String getBusinessName() {
		return businessName;
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
	public void setRole(Role role) {
		this.role = role;
	}
	public UserDTO(String firstName, String lastName, String businessName, String location, String username,
			String password, Role role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.businessName = businessName;
		this.location = location;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public BusinessUser getBusinessUser() {
		return businessUser;
	}
	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}
	
	
}
