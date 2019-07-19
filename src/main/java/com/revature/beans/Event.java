package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EVENTS")
public class Event {
	
	@Id
	@Column(name="EVENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eventId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User user;
	
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
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="event")
	private Set<Rsvp> rsvps = new HashSet<Rsvp>();
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="EVENT_ID")
	private BusinessMessage businessMessage;
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY, mappedBy="event")
	private Set<EventMessage> eventMessageList = new HashSet<EventMessage>();

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(Integer eventId, User user, String title, String location, String timeOfEvent, String dateOfEvent,
			String timePosted, String description, Boolean onTimeLine, BusinessMessage businessMessage) {
		super();
		this.eventId = eventId;
		this.user = user;
		this.title = title;
		this.location = location;
		this.timeOfEvent = timeOfEvent;
		this.dateOfEvent = dateOfEvent;
		this.timePosted = timePosted;
		this.description = description;
		this.onTimeLine = onTimeLine;
		this.businessMessage = businessMessage;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public BusinessMessage getBusinessMessage() {
		return businessMessage;
	}

	public void setBusinessMessage(BusinessMessage businessMessage) {
		this.businessMessage = businessMessage;
	}

//	@Override
//	public String toString() {
//		return "Event [eventId=" + eventId + ", user=" + user + ", title=" + title + ", location=" + location
//				+ ", timeOfEvent=" + timeOfEvent + ", dateOfEvent=" + dateOfEvent + ", timePosted=" + timePosted
//				+ ", description=" + description + ", onTimeLine=" + onTimeLine + ", rsvps=" + rsvps
//				+ ", businessMessage=" + businessMessage + ", eventMessageList=" + eventMessageList + "]";
//	}

	
}