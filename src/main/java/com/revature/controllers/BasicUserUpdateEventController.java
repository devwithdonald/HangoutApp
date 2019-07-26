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

@RestController("/BasicUser/PrivateEvents/UpdateEvent")
@CrossOrigin(origins = "*")
public class BasicUserUpdateEventController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventService eventService;


	@Autowired
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	@PostMapping(value = "/BasicUser/PrivateEvents/UpdateEvent", consumes = { "application/json" })
	public @ResponseBody boolean basicUserEventPost(@RequestBody Event event) {
		log.log(Level.INFO, "inside basicUserEventPost");
		
		User user = event.getUser();

		// verifying event
		Event verifiedEvent = eventService.validateEventForUser(event, user);

		if (verifiedEvent != null) {
			return eventService.updateBasicUserEvent(event, verifiedEvent);
		} else {
			return false;
		}
	}

}
