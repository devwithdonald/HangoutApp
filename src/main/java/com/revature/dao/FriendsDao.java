package com.revature.dao;

import java.util.List;

import com.revature.beans.User;

public interface FriendsDao {
	
	public User getAllFriendsByUserId(int userId);
	
	public User getFriendByFriendId(User user, int friendId);
	
	public boolean addFriend(User user);
	
	public boolean removeFriend(User user);

}