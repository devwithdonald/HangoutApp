package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBSCRIPTIONS")
public class Subscriptions {
	
	@Id
	@Column(name="SUBSCRIPTION_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subscriptionId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private BasicUser basicUser;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private BusinessUser businessUser;
	
	@Column(name="TIME_OF_SUB")
	private String timeOfSub;
	
	@Column(name="RSVP_COUNT")
	private int rsvpCount;

	public BasicUser getBasicUser() {
		return basicUser;
	}

	public void setBasicUser(BasicUser basicUser) {
		this.basicUser = basicUser;
	}

	public BusinessUser getBusinessUser() {
		return businessUser;
	}

	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}

	public Subscriptions(BasicUser basicUser, BusinessUser businessUser, String timeOfSub,
			int rsvpCount) {
		super();
		this.basicUser = basicUser;
		this.businessUser = businessUser;
		this.timeOfSub = timeOfSub;
		this.rsvpCount = rsvpCount;
	}

	public Subscriptions() {
		super();
	}
	
	public int getSubscriptionId() {
		return subscriptionId;
	}
	
	public void setSubscriptionId(int subscriptionID) {
		this.subscriptionId = subscriptionID;
	}
	
	public String getTimeOfSub() {
		return timeOfSub;
	}
	
	public void setTimeOfSub(String timeStamp) {
		this.timeOfSub = timeStamp;
	}
	
	public int getRsvpCount() {
		return rsvpCount;
	}
	
	public void setRsvpCount(int rsvpCount) {
		this.rsvpCount = rsvpCount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basicUser == null) ? 0 : basicUser.hashCode());
		result = prime * result + ((businessUser == null) ? 0 : businessUser.hashCode());
		result = prime * result + rsvpCount;
		result = prime * result + subscriptionId;
		result = prime * result + ((timeOfSub == null) ? 0 : timeOfSub.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscriptions other = (Subscriptions) obj;
		if (basicUser == null) {
			if (other.basicUser != null)
				return false;
		} else if (!basicUser.equals(other.basicUser))
			return false;
		if (businessUser == null) {
			if (other.businessUser != null)
				return false;
		} else if (!businessUser.equals(other.businessUser))
			return false;
		if (rsvpCount != other.rsvpCount)
			return false;
		if (subscriptionId != other.subscriptionId)
			return false;
		if (timeOfSub == null) {
			if (other.timeOfSub != null)
				return false;
		} else if (!timeOfSub.equals(other.timeOfSub))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subscriptions [subscriptionId=" + subscriptionId + ", basicUser=" + basicUser + ", businessUser="
				+ businessUser + ", timeOfSub=" + timeOfSub + ", rsvpCount=" + rsvpCount + "]";
	}
}