package com.revature.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Event;
import com.revature.services.EventServiceImpl;

@RestController("/BasicUser/PrivateEvents")
@CrossOrigin(origins = "*")
public class BasicUserGetEventsController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventServiceImpl eventService;

	@Autowired
	public void setEventService(EventServiceImpl eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping("/BasicUser/PrivateEvents")
	public List<Event> basicUserEventGet() {
		log.log(Level.INFO, "inside basicUserEventGet");
		return eventService.getAllBasicUserEvents();
	}

}
