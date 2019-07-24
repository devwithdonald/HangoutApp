package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/logout")
@CrossOrigin(origins = "*")
public class LogoutController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	@GetMapping("/logout")
	public void logoutGet(HttpSession sess) {
		log.log(Level.INFO, sess.getAttribute("user") + " Logged out successfully.");
		//sess.invalidate();
		log.log(Level.INFO, "Logged out successfully.");
	}
}
