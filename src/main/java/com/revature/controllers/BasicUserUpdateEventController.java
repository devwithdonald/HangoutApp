package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	//GET request handles returning if a event exists for THAT user 
	@GetMapping("/BasicUser/PrivateEvents/UpdateEvent")
	public boolean basicUserEventGet(Event event, HttpSession sess) {
		log.log(Level.INFO, "inside basicUserEventGet");
		
		User user = (User) sess.getAttribute("user");
		return eventService.validateEventForUser(event, user);
	}
}
