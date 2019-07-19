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
//@Controller
@RestController("/login")
@CrossOrigin(origins="*")
public class LoginController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

//	private UserServiceImpl userService;
//
//	@Autowired
//	public void setUserService(UserServiceImpl userService) {
//		this.userService = userService;
//	}
	
	
//	//test
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public void loginGet(HttpSession sess) {
//		System.out.println("here");
//	}
	
	//test
	@GetMapping
	public String loginGet() {
		
		return "hi";
//		System.out.println("here");
	}

//	@PostMapping(value = "/login", consumes = { "application/json" })
//	public @ResponseBody User loginPost(@RequestBody User user) { //HttpSession sess) {
//		log.log(Level.INFO, "Attempted Login: " + user);
//
//		User authUser = usi.validateUser(user);
//
//		if (authUser != null) {
//			//sess.setAttribute("user", authUser);
//			log.log(Level.INFO, "Logged in user: " + authUser);
//			return authUser;
//		}
//
//		return null;
//	}

}
