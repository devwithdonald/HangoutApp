package com.revature.controllers;

import java.util.List;
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

@RestController("/BusinessUser/BusinessUserEventManager")
@CrossOrigin(origins = "*")
public class BusinessUserEventsController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventServiceImpl eventService;

	@Autowired
	public void setEventService(EventServiceImpl eventService) {
		this.eventService = eventService;
	}

	@GetMapping("/BusinessUser/BusinessUserEventManager")
	public List<Event> businessUserEventGet(HttpSession sess) {
		log.log(Level.INFO, "inside businessUserEventGet");
		// TODO need to uncomment when session works
		// User user = (User) sess.getAttribute("user");

		// TODO THIS NEEDS TO CHANGE
		User user = new User();
		user.setUserId(2);
		
		return eventService.getAllBusinessUserEvents(user);
	}

}
