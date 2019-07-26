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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="SUBSCRIPTIONS")
public class Subscriptions {
	
	@Id
	@Column(name="SUBSCRIPTION_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subscriptionId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_USER_ID")
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

	@Autowired
	public void setBasicUser(BasicUser basicUser) {
		this.basicUser = basicUser;
	}

	public BusinessUser getBusinessUser() {
		return businessUser;
	}

	@Autowired
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

//	@Override
//	public String toString() {
//		return "Subscriptions [subscriptionId=" + subscriptionId + ", basicUser=" + basicUser + ", businessUser="
//				+ businessUser + ", timeOfSub=" + timeOfSub + ", rsvpCount=" + rsvpCount + "]";
//	}
}