package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="BUSINESS_EMPLOYEE")
public class BusinessEmployeeUser extends User{

	@Column(name="EMPLOYEE_NAME")
	private String employerName;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="business_message_id")
	private BusinessMessage businessMessage;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="business_id")
	private BusinessUser businessUser;
	
	public BusinessEmployeeUser() {
		super();
	}
	
	public BusinessEmployeeUser(int id, String username, String password) {
		super(id, username, password);
	}
	
	public BusinessEmployeeUser(String employerName, BusinessMessage businessMessage) {
		super();
		this.employerName = employerName;
		this.businessMessage = businessMessage;
	}
	
	public String getEmployerName() {
		return employerName;
	}
	
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	
	public BusinessMessage getBusinessMessage() {
		return businessMessage;
	}
	
	public void setBusinessMessage(BusinessMessage businessMessage) {
		this.businessMessage = businessMessage;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((businessMessage == null) ? 0 : businessMessage.hashCode());
		result = prime * result + ((employerName == null) ? 0 : employerName.hashCode());
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
		BusinessEmployeeUser other = (BusinessEmployeeUser) obj;
		if (businessMessage == null) {
			if (other.businessMessage != null)
				return false;
		} else if (!businessMessage.equals(other.businessMessage))
			return false;
		if (employerName == null) {
			if (other.employerName != null)
				return false;
		} else if (!employerName.equals(other.employerName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "BusinessEmployeeUser [employerName=" + employerName + ", businessMessage=" + businessMessage + "]";
	}
	
	
	
}