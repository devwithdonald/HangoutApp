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

import com.revature.beans.BasicUser;
import com.revature.beans.RsvpDTO;
import com.revature.beans.User;
import com.revature.dao.EventDao;
import com.revature.dao.UserDao;
import com.revature.services.RsvpService;
import com.revature.services.RsvpServiceImpl;

@RestController("/BasicUser/Events")
@CrossOrigin(origins = "*")
public class BasicUserEventsRSVP {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private RsvpService rsvpService;
	
	private UserDao userDao;
	
	private EventDao eventDao;
	//NEED TO DELETE ONCE USER SESSION WORKS
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	

	@Autowired
	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	@Autowired
	public void setRsvpService(RsvpService rsvpService) {
		this.rsvpService = rsvpService;
	}

	@PostMapping(path = "/BasicUser/Events", consumes = { "application/json" })
	public @ResponseBody Boolean basicUserRSVPPost(@RequestBody RsvpDTO rsvp, HttpSession sess) {
		log.log(Level.INFO, "Attempting to RSVP event: " + rsvp.getEventID());
		User user = new User();
		user.setUsername("test_user1");
		user.setPassword("user1");
		BasicUser basic = new BasicUser();
		basic.setUsername(user.getUsername());
		basic.setPassword(user.getPassword());
		user = userDao.getUser(user);
		basic.setUserId(user.getUserId());
		basic.setRole(user.getRole());
		basic.setFirstName("donny");
		basic.setLastName("henderson");
		rsvp.setUser(basic);
		if(rsvp.getStatus().equals("Accepted"))
		{
			rsvp.setEvent(eventDao.getEventByEventId(rsvp.getEventID()));
			log.log(Level.INFO, "RSVP event -> " + rsvp.getEvent());
			rsvpService.addRsvp(rsvp);
			return true;
		}
		else if(rsvp.getStatus().equals("Rejected")) {
			rsvp.setEvent(eventDao.getEventByEventId(rsvp.getEventID()));
			rsvpService.rejectRsvp(rsvp);
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
