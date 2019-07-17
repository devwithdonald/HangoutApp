package com.revature.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.beans.User;
import com.revature.services.UserServiceImpl;

@Controller
public class LoginController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");
	
	UserServiceImpl usi;
	
	@Autowired
	public void setUserServiceImpl(UserServiceImpl usi) {
		this.usi = usi;
	}
	
	@PostMapping(value="/login", consumes= {"application/json"})
	public @ResponseBody User loginPost(@RequestBody User user, HttpSession sess) {
		log.log(Level.INFO, "Attempted Login: " + user);
		User authUser = usi.validateUser(user);
		if (authUser != null) {
			sess.setAttribute("user", authUser);
			log.log(Level.INFO, "Logged in user: " + authUser);
			return authUser;
		}
		return null;
	}
	
	
}
