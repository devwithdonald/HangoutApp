package com.revature.services;

import java.util.Set;

import com.revature.beans.User;

public interface FriendsService {

	public User getAllFriendsByUserId(int userId);
	
	public boolean addFriend(User user);
	
	public boolean removeFriend(User user);
	
	public User getFriendByFriendId(User user, int friendId);
	
	
}
