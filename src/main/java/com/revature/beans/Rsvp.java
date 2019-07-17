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

	public void setEvent(Event event) {
		this.event = event;
	}

	public BasicUser getBasicUser() {
		return basicUser;
	}

	public void setBasicUser(BasicUser basicUser) {
		this.basicUser = basicUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basicUser == null) ? 0 : basicUser.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((rsvpId == null) ? 0 : rsvpId.hashCode());
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
		Rsvp other = (Rsvp) obj;
		if (basicUser == null) {
			if (other.basicUser != null)
				return false;
		} else if (!basicUser.equals(other.basicUser))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (rsvpId == null) {
			if (other.rsvpId != null)
				return false;
		} else if (!rsvpId.equals(other.rsvpId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rsvp [rsvpId=" + rsvpId + ", event=" + event + ", basicUser=" + basicUser + "]";
	}
	
}