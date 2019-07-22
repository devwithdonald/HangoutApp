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
@Table(name="RSVPS")
public class Rsvp {
	
	@Id
	@Column(name="RSVP_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rsvpId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="EVENT_ID")
	private Event event;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_USER_ID")
	private BasicUser basicUser;

	public Rsvp() {
		super();
	}

	public Rsvp(Integer rsvpId, Event event, BasicUser basicUser) {
		super();
		this.rsvpId = rsvpId;
		this.event = event;
		this.basicUser = basicUser;
	}

	public Integer getRsvpId() {
		return rsvpId;
	}

	public void setRsvpId(Integer rsvpId) {
		this.rsvpId = rsvpId;
	}

	public Event getEvent() {
		return event;
	}

	@Autowired
	public void setEvent(Event event) {
		this.event = event;
	}

	public BasicUser getBasicUser() {
		return basicUser;
	}

	@Autowired
	public void setBasicUser(BasicUser basicUser) {
		this.basicUser = basicUser;
	}

//	@Override
//	public String toString() {
//		return "Rsvp [rsvpId=" + rsvpId + ", event=" + event + ", basicUser=" + basicUser + "]";
//	}
	
}