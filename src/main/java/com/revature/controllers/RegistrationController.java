package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.UserDTO;
import com.revature.services.UserService;

@RestController("/register")
@CrossOrigin(origins = "*")
public class RegistrationController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/register")
	public void registerGet() {
		
	}
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value="/register", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean registerPost(@RequestBody UserDTO user, HttpSession sess) {
		log.log(Level.INFO, "Attempted Registration: " + user);
		return userService.addUser(user, user.getRole().getRoleType());
	}
	
}
