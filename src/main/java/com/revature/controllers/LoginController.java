package com.revature.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.dao.UserDaoImpl;
import com.revature.services.UserServiceImpl;
//@Controller
@RestController("/login")
@CrossOrigin(origins="*")
public class LoginController {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private UserServiceImpl usi;
	private static UserDaoImpl udi;
//
	@Autowired
	public void setUserService(UserServiceImpl userService) {
		this.usi = userService;
	}
	
	
//	//test
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public void loginGet(HttpSession sess) {
//		System.out.println("here");
//	}
	
	//test
	//@GetMapping
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
		
		return "hillo";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost(User user) {
		//log.log(Level.INFO, "Attempted Login: " + user);
		//System.out.println("there " + s);
		//System.out.println(user);
		User authUser = usi.validateUser(user);
		
		
		//if (authUser != null) {
			
		//	return "home";

		if (authUser != null) {
			//sess.setAttribute("user", authUser);
			//log.log(Level.INFO, "Logged in user: " + authUser);
			return "authUser";
		}

		return "help";
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
