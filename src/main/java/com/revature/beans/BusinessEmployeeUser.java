package com.revature.beans;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="BUSINESS_EMPLOYEE_USER")
public class BusinessEmployeeUser extends User{

//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name="business_id")
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private User businessUser;
//	private BusinessUser businessUser;

	public BusinessEmployeeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessEmployeeUser(int userId, String username, String password, Role role, BusinessUser businessUser) {
		super(userId, username, password, role);
		this.businessUser = businessUser;
	}

	
	//CHANGING THIS
	public User getBusinessUser() {
		return businessUser;
	}
	//CHANGING THIS
	public void setBusinessUser(User businessUser) {
		this.businessUser = businessUser;
	}

//	@Override
//	public String toString() {
//		return "BusinessEmployeeUser [businessUser=" + businessUser + "]";
//	}

		
	
	
}