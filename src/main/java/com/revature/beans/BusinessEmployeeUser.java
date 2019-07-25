package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
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
	private BusinessUser businessUser;
//	private BusinessUser businessUser;

	public BusinessEmployeeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public BusinessEmployeeUser(int userId, String username, String password, Role role, BusinessUser businessUser) {
//		super(userId, username, password, role);
//		this.businessUser = businessUser;
//	}

	
	//CHANGING THIS
	public BusinessUser getBusinessUser() {
		return businessUser;
	}
	//CHANGING THIS
	@Autowired
	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}

//	@Override
//	public String toString() {
//		return "BusinessEmployeeUser [businessUser=" + businessUser + "]";
//	}

		
	
	
}