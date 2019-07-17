package com.revature.services;

import java.util.List;

import com.revature.beans.Friends;
import com.revature.beans.User;

public interface FriendsService {

	public List<Friends> getAllFriendsByUser(User user);
	
	public boolean addFriend(User user);
	
	public boolean removeFriend(User user);
	
	public User getFriendByFriendId(User user, int friendId);
	
	
}
