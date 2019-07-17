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
@Table(name="EVENTS")
public class Event {
	
	@Id
	@Column(name="EVENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eventId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_USER_ID")
	private BasicUser basicUser;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private BusinessUser businessUser;
	
	//@Column(name="")
	//private String posterName;
	
//	@Column(name="")
//	private String eventType;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="TIME_OF_EVENT")
	private String timeOfEvent;
	
	@Column(name="DATE_OF_EVENT")
	private String dateOfEvent;
	
	@Column(name="TIME_POSTED")
	private String timePosted;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="ON_TIMELINE")
	private Boolean onTimeLine;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(Integer eventId, BasicUser basicUser, BusinessUser businessUser, String title, String location,
			String timeOfEvent, String dateOfEvent, String timePosted, String description, Boolean onTimeLine) {
		super();
		this.eventId = eventId;
		this.basicUser = basicUser;
		this.businessUser = businessUser;
		this.title = title;
		this.location = location;
		this.timeOfEvent = timeOfEvent;
		this.dateOfEvent = dateOfEvent;
		this.timePosted = timePosted;
		this.description = description;
		this.onTimeLine = onTimeLine;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimeOfEvent() {
		return timeOfEvent;
	}

	public void setTimeOfEvent(String timeOfEvent) {
		this.timeOfEvent = timeOfEvent;
	}

	public String getDateOfEvent() {
		return dateOfEvent;
	}

	public void setDateOfEvent(String dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public String getTimePosted() {
		return timePosted;
	}

	public void setTimePosted(String timePosted) {
		this.timePosted = timePosted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getOnTimeLine() {
		return onTimeLine;
	}

	public void setOnTimeLine(Boolean onTimeLine) {
		this.onTimeLine = onTimeLine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basicUser == null) ? 0 : basicUser.hashCode());
		result = prime * result + ((businessUser == null) ? 0 : businessUser.hashCode());
		result = prime * result + ((dateOfEvent == null) ? 0 : dateOfEvent.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((onTimeLine == null) ? 0 : onTimeLine.hashCode());
		result = prime * result + ((timeOfEvent == null) ? 0 : timeOfEvent.hashCode());
		result = prime * result + ((timePosted == null) ? 0 : timePosted.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Event other = (Event) obj;
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
		if (dateOfEvent == null) {
			if (other.dateOfEvent != null)
				return false;
		} else if (!dateOfEvent.equals(other.dateOfEvent))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (onTimeLine == null) {
			if (other.onTimeLine != null)
				return false;
		} else if (!onTimeLine.equals(other.onTimeLine))
			return false;
		if (timeOfEvent == null) {
			if (other.timeOfEvent != null)
				return false;
		} else if (!timeOfEvent.equals(other.timeOfEvent))
			return false;
		if (timePosted == null) {
			if (other.timePosted != null)
				return false;
		} else if (!timePosted.equals(other.timePosted))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", basicUser=" + basicUser + ", businessUser=" + businessUser + ", title="
				+ title + ", location=" + location + ", timeOfEvent=" + timeOfEvent + ", dateOfEvent=" + dateOfEvent
				+ ", timePosted=" + timePosted + ", description=" + description + ", onTimeLine=" + onTimeLine + "]";
	}

	
	
}