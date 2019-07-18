package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BUSINESS_MESSAGES")
public class BusinessMessage extends Message {
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private BusinessUser businessUser;

	public BusinessMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
		// TODO Auto-generated constructor stub
	}

	public BusinessMessage(BusinessUser businessUser) {
		super();
		this.businessUser = businessUser;
	}

	public BusinessUser getBusinessUser() {
		return businessUser;
	}

	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((businessUser == null) ? 0 : businessUser.hashCode());
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
		BusinessMessage other = (BusinessMessage) obj;
		if (businessUser == null) {
			if (other.businessUser != null)
				return false;
		} else if (!businessUser.equals(other.businessUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusinessMessage [businessUser=" + businessUser + "]";
	}

	

}