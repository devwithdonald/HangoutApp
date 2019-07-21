package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.services.EventServiceImpl;

@RestController("/BasicUser/PrivateEvents/UpdateEvent")
@CrossOrigin(origins = "*")
public class BasicUserUpdateEventController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventServiceImpl eventService;

	@Autowired
	public void setEventService(EventServiceImpl eventService) {
		this.eventService = eventService;
	}
	
	// MAKE GET REQUEST TO UPDATE FORM
	
	@PostMapping(value = "/BasicUser/PrivateEvents/UpdateEvent",consumes = { "application/json" })
	public @ResponseBody boolean basicUserEventPost(@RequestBody Event event, HttpSession sess) {
		log.log(Level.INFO, "inside basicUserEventGet");
		
		//TODO THIS NEEDS TO CHANGE
		//User user = (User) sess.getAttribute("user");
		User user = new User();
		user.setUserId(1);
		
		Event event1 = new Event();
		event1.setEventId(8);
		
		return eventService.validateEventForUser(event1, user);
	}
	
	@PutMapping(value = "/BasicUser/PrivateEvents/UpdateEvent",consumes = { "application/json" })
	public @ResponseBody boolean basicUserEventPut(@RequestBody Event event) {
		log.log(Level.INFO, "inside basicUserEventGet");
		return eventService.updateEvent(event);
	}
}
