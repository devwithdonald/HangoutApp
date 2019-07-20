package com.revature.beans;

public class UserDTO {
	private String firstName;
	private String lastName;
	private String businessName;
	private String location;
	private String username;
	private String password;
	private Role role;
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
	
	
}
