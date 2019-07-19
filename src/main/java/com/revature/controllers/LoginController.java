package com.revature.controllers;

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

import com.revature.beans.User;
import com.revature.services.UserServiceImpl;

@RestController("/login")
@CrossOrigin(origins = "*")
public class LoginController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private UserServiceImpl userService;

	@Autowired
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	@GetMapping
	public void loginGet() {
		// TODO
	}

	@PostMapping(value = "/login", consumes = { "application/json" })
	public @ResponseBody User loginPost(@RequestBody User user, HttpSession sess) {
		log.log(Level.INFO, "Attempted Login: " + user);

		User authUser = userService.validateUser(user);

		if (authUser != null) {
			sess.setAttribute("user", authUser);
			log.log(Level.INFO, "Session attribute set to: " + sess.getAttribute("user"));
			log.log(Level.INFO, "Logged in user: " + authUser);
			return authUser;
		}
		return null;
	}

}
