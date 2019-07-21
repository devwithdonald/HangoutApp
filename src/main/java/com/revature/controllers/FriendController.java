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

@RestController("/friends")
@CrossOrigin(origins = "*")
public class FriendController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private UserServiceImpl userService;

	@Autowired
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	@GetMapping("/friends")
	public void friendsGet() {
		// TODO
	}

	@PostMapping(value = "/friends", consumes = { "application/json" })
	public @ResponseBody User friendsPost(@RequestBody User user, HttpSession sess) {
		// TODO


		return null;
	}

}
