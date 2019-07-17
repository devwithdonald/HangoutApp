package com.revature.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="BUSINESS_USER")
public class BusinessUser extends User {

	@Column(name="BUSINESS_NAME")
	private String businessName;
	
	@Column(name="BUSINESS_LOCATION")
	private String location;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="businessUser")
	private Set<Subscriptions> subscriberList;
	
	public BusinessUser() {
		super();
	}
	
	public BusinessUser(int id, String username, String password) {
		super(id, username, password);
	}
	
	public BusinessUser(String businessName, String location, Set<Subscriptions> subscriberList) {
		super();
		this.businessName = businessName;
		this.location = location;
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
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "BusinessUser [businessName=" + businessName + ", location=" + location + "]";
	}
	
	
	
}