package com.revature.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.BasicUser;
import com.revature.beans.Event;
import com.revature.beans.Role;
import com.revature.beans.RsvpDTO;
import com.revature.beans.User;
import com.revature.dao.EventDao;
import com.revature.dao.UserDao;
import com.revature.services.EventService;
import com.revature.services.RsvpService;
import com.revature.services.RsvpServiceImpl;

@RestController("/BasicUser/Events")
@CrossOrigin(origins = "*")
public class BasicUserEventsRSVP {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private RsvpService rsvpService;
	
	private UserDao userDao;
	
	private EventService eventService;
	//NEED TO DELETE ONCE USER SESSION WORKS
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	

	@Autowired
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	@Autowired
	public void setRsvpService(RsvpService rsvpService) {
		this.rsvpService = rsvpService;
	}

	@GetMapping(path = "/BasicUser/Events")
	public @ResponseBody List<Event> basicUserRSVPGet(){
		return eventService.getAllPublicEvents();
	}
	
	@PostMapping(path = "/BasicUser/Events", consumes = { "application/json" })
	public @ResponseBody Boolean basicUserRSVPPost(@RequestBody RsvpDTO rsvp, HttpSession sess) {
		System.out.println(rsvp.getEventId());
		log.log(Level.INFO, "Attempting to RSVP event: " + rsvp.getEventId());
		rsvp.setUser(new BasicUser(12, "test_user20", "user20", new Role(3, "BascUser"), "don", "jon"));
		if(rsvp.getStatus().equals("Accepted"))
		{
			rsvp.setEvent(eventService.getEventByEventId(rsvp.getEventId()));
			log.log(Level.INFO, "RSVP event -> " + rsvp.getEvent());
			rsvpService.addRsvp(rsvp);
			return true;
		}
		else if(rsvp.getStatus().equals("Rejected")) {
			rsvp.setEvent(eventService.getEventByEventId(rsvp.getEventId()));
			rsvpService.rejectRsvp(rsvp);
			return true;
		}
		else {
			return false;
		}
	}
}
