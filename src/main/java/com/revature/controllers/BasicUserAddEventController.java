package com.revature.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Event;
import com.revature.services.EventServiceImpl;

@RestController("/BasicUser/PrivateEvents/AddEvent")
@CrossOrigin(origins = "*")
public class BasicUserAddEventController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventServiceImpl eventService;

	@Autowired
	public void setEventService(EventServiceImpl eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping("/BasicUser/PrivateEvents/AddEvent")
	public List<Event> basicUserEventGet() {
		return eventService.getAllBasicUserEvents();
	}
	
	
	@PostMapping(value = "/BasicUser/PrivateEvents/AddEvent", consumes = { "application/json" })
	public @ResponseBody Boolean basicUserEventPost(@RequestBody Event event) {
		log.log(Level.INFO, "Attempting to add event: " + event);
		if (eventService.addBasicUserEvent(event)) {
			return true;
		}
		return false;
	}
}
