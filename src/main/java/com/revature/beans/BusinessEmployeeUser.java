package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="BUSINESS_EMPLOYEE_USER")
public class BusinessEmployeeUser extends User{

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="business_id")
	private BusinessUser businessUser;

	public BusinessEmployeeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessEmployeeUser(int userId, String username, String password, Role role, BusinessUser businessUser) {
		super(userId, username, password, role);
		this.businessUser = businessUser;
	}

	public BusinessUser getBusinessUser() {
		return businessUser;
	}

	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}

//	@Override
//	public String toString() {
//		return "BusinessEmployeeUser [businessUser=" + businessUser + "]";
//	}

		
	
	
}