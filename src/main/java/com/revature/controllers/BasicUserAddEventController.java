package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.services.EventService;
import com.revature.services.EventServiceImpl;

@RestController("/BasicUser/PrivateEvents/AddEvent")
@CrossOrigin(origins = "*")
public class BasicUserAddEventController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventService eventService;
	
	//NEED TO DELETE ONCE USER SESSION WORKS
	private UserDao userDao;

	//NEED TO DELETE ONCE USER SESSION WORKS
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setEventService(EventServiceImpl eventService) {
		this.eventService = eventService;
	}

	@PostMapping(value = "/BasicUser/PrivateEvents/AddEvent", consumes = { "application/json" })
	public @ResponseBody Boolean basicUserEventPost(@RequestBody Event event, HttpSession sess) {
		log.log(Level.INFO, "Attempting to add event: " + event);
		
		System.out.println("Event passed in contents -> " + event);

		if (eventService.addBasicUserEvent(event)) {
			return true;
		}
		return false;
	}
}
