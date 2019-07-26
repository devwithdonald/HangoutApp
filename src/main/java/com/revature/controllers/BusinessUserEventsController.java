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

import com.revature.beans.Event;
import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.services.EventService;

@RestController("/BusinessUser/BusinessUserEventManager")
@CrossOrigin(origins = "*")
public class BusinessUserEventsController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventService eventService;


	@Autowired
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	@PostMapping(path = "/BusinessUser/BusinessUserEventManager", consumes = {
	"application/json" })
	public @ResponseBody List<Event> businessUserEventGet(@RequestBody User user) {
		log.log(Level.INFO, "inside businessUserEventGet");

		System.out.println("logged in business user: " + user);

		return eventService.getAllBusinessUserEvents(user);
	}

	@PostMapping(path = "/BusinessUser/BusinessUserEventManager/BusinessUserAddBusinessEvent", consumes = {
			"application/json" })
	public @ResponseBody Boolean businessUserEventPost(@RequestBody Event event) {
		log.log(Level.INFO, "Attempting to add event: " + event);


		if (eventService.addBusinessPublicEvent(event)) {
			return true;
		}
		return false;
	}

	@PostMapping(path = "/BusinessUser/BusinessUserEventManager/BusinessUserUpdateBusinessEvent", consumes = {
			"application/json" })
	public @ResponseBody Boolean businessUserEventUpdate(@RequestBody Event event) {
		log.log(Level.INFO, "Attempting to update event: " + event);


		User user = event.getUser();
		
		// verifying event
		Event verifiedEvent = eventService.validateEventForUser(event, user);

		if (verifiedEvent != null) {
			return eventService.updateBusinessEvent(event, verifiedEvent);
		} else {
			return false;
		}


	}

	@PostMapping(path = "/BusinessUser/BusinessUserEventManager/BusinessUserRemoveBusinessEvent", consumes = {
			"application/json" })
	public @ResponseBody Boolean businessUserEventRemove(@RequestBody Event event) {
		log.log(Level.INFO, "Attempting to delete event: " + event);


	
		User user = event.getUser();

		// verifying event
		Event verifiedEvent = eventService.validateEventForUser(event, user);
		
		if (verifiedEvent != null) {
			return eventService.removeEvent(event);
		} else {
			return false;
		}
	}
}
