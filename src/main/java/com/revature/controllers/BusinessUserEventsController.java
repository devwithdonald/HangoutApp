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
import com.revature.dao.UserDaoImpl;
import com.revature.services.EventServiceImpl;

@RestController("/BusinessUser/BusinessUserEventManager")
@CrossOrigin(origins = "*")
public class BusinessUserEventsController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private EventServiceImpl eventService;
	
	//NEED TO DELETE ONCE USER SESSION WORKS
	private UserDaoImpl userDao;

	//NEED TO DELETE ONCE USER SESSION WORKS
	@Autowired
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

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
	
	@PostMapping(path="/BusinessUser/BusinessUserEventManager/BusinessUserAddBusinessEvent", consumes = { "application/json" })
	public @ResponseBody Boolean businessUserEventPost(@RequestBody Event event, HttpSession sess) {
		log.log(Level.INFO, "Attempting to add event: " + event);
		
		// TODO ADD USER SESSION
		//event.setUser((User) sess.getAttribute("user"));
		
		//Need to Delete
		//Faking user
		User user = new User();
		user.setUsername("test_biz2");
		user.setPassword("biz1");
		event.setUser(userDao.getUser(user));
		
		if (eventService.addBusinessPublicEvent(event)) {
			return true;
		}
		return false;
	}
	
	@PostMapping(path="/BusinessUser/BusinessUserEventManager/BusinessUserUpdateBusinessEvent", consumes = { "application/json" })
	public @ResponseBody Boolean businessUserEventUpdate(@RequestBody Event event, HttpSession sess) {
		log.log(Level.INFO, "Attempting to update event: " + event);
		
		// TODO ADD USER SESSION
		//event.setUser((User) sess.getAttribute("user"));
		
		//Need to Delete
		//Faking user
		User user = new User();
		user.setUsername("test_biz2");
		user.setPassword("biz1");
		user = userDao.getUser(user);
		event.setUser(user);
		
		return eventService.validateEventForUser(event, user);
	}

}
