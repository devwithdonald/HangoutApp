package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BUSINESS_USER")
public class BusinessUser extends User {

	@Column(name="BUSINESS_NAME")
	private String businessName;
	
	@Column(name="BUSINESS_LOCATION")
	private String location;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<BusinessEmployeeUser> employeeList = new HashSet<BusinessEmployeeUser>();
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<BusinessMessage> messageList = new HashSet<BusinessMessage>();
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<Subscriptions> subscriberList;

	public BusinessUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessUser(int userId, String username, String password, Role role, String businessName, String location,
			Set<BusinessEmployeeUser> employeeList, Set<BusinessMessage> messageList,
			Set<Subscriptions> subscriberList) {
		super(userId, username, password, role);
		this.businessName = businessName;
		this.location = location;
		this.employeeList = employeeList;
		this.messageList = messageList;
		this.subscriberList = subscriberList;
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

	public Set<BusinessEmployeeUser> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<BusinessEmployeeUser> employeeList) {
		this.employeeList = employeeList;
	}

	public Set<BusinessMessage> getMessageList() {
		return messageList;
	}

	public void setMessageList(Set<BusinessMessage> messageList) {
		this.messageList = messageList;
	}

	public Set<Subscriptions> getSubscriberList() {
		return subscriberList;
	}

	public void setSubscriberList(Set<Subscriptions> subscriberList) {
		this.subscriberList = subscriberList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((businessName == null) ? 0 : businessName.hashCode());
		result = prime * result + ((employeeList == null) ? 0 : employeeList.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((messageList == null) ? 0 : messageList.hashCode());
		result = prime * result + ((subscriberList == null) ? 0 : subscriberList.hashCode());
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
		BusinessUser other = (BusinessUser) obj;
		if (businessName == null) {
			if (other.businessName != null)
				return false;
		} else if (!businessName.equals(other.businessName))
			return false;
		if (employeeList == null) {
			if (other.employeeList != null)
				return false;
		} else if (!employeeList.equals(other.employeeList))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (messageList == null) {
			if (other.messageList != null)
				return false;
		} else if (!messageList.equals(other.messageList))
			return false;
		if (subscriberList == null) {
			if (other.subscriberList != null)
				return false;
		} else if (!subscriberList.equals(other.subscriberList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusinessUser [businessName=" + businessName + ", location=" + location + ", employeeList="
				+ employeeList + ", messageList=" + messageList + ", subscriberList=" + subscriberList + "]";
	}
	
	
}