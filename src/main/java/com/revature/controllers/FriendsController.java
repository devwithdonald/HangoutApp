package com.revature.controllers;

import java.util.Set;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.services.FriendsService;

@RestController("/BasicUser/Friends")
@CrossOrigin(origins = "*")
public class FriendsController {
	
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	private FriendsService friendsService;

	@Autowired
	public void setFriendsService(FriendsService friendsService) {
		this.friendsService = friendsService;
	}


	@PostMapping(value = "/BasicUser/Friends", consumes = { "application/json" })
	public @ResponseBody User friendsGet(@RequestBody int userId) {
		// TODO
		//return friend list!
		return friendsService.getAllFriendsByUserId(userId);
	}

}
