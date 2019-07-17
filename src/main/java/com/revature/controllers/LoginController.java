package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.revature.services.UserServiceImpl;

@Controller
public class LoginController {

	UserServiceImpl usi;
	
	@Autowired
	public void setUserServiceImpl(UserServiceImpl usi) {
		this.usi = usi;
	}
	
	//@PostMapping(value="/login", consumes= {"application/json"})
	//public @ResponseBody User
	
	
}
