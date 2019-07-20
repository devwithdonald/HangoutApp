package com.revature.controllers;

import javax.servlet.http.HttpSession;


import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.BasicUser;
import com.revature.beans.User;
import com.revature.services.UserServiceImpl;
import com.revature.beans.UserDTO;

@RestController("/register")
@CrossOrigin(origins = "*")
public class RegistrationController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	private UserServiceImpl userService;
	
	@Autowired
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	@GetMapping("/register")
	public void registerGet() {
		
	}
	
	@PostMapping(value = "/register", consumes = { "application/json" })
	public boolean registerPost(@RequestBody UserDTO user, HttpSession sess) {
		log.log(Level.INFO, "Attempted Registration: " + user);
		return userService.addUser(user, user.getRole().getRoleType());
	}
	
}
