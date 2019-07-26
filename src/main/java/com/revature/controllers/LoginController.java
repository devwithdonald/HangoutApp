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

import com.revature.beans.User;
import com.revature.services.UserService;

@RestController("/login")
@CrossOrigin(origins = "*")
public class LoginController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	//TODO CHANGE THIS!!!!!!!!!!!!
	@GetMapping("/login")
	public List<User> loginGet() {
		// TODO
		return userService.getAllUsers();
	}

	@PostMapping(value = "/login", consumes = { "application/json" })
	public @ResponseBody User loginPost(@RequestBody User user) {
		log.log(Level.INFO, "Attempted Login: " + user);

		User authUser = userService.validateUser(user);

		if (authUser != null) {
			log.log(Level.INFO, "Logged in user: " + authUser);
			return authUser;
		}
		return null;
	}

}
