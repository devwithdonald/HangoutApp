package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.dao.FriendsDao;


@Service
public class FriendsServiceImpl implements FriendsService {
	
	private FriendsDao friendsDao;

	@Autowired
	public void setFriendsDao(FriendsDao friendsDao) {
		this.friendsDao = friendsDao;
	}
	
	@Override
	public User getAllFriendsByUserId(int userId) {
		return friendsDao.getAllFriendsByUserId(userId);
	}

	@Override
	public boolean addFriend(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFriend(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getFriendByFriendId(User user, int friendId) {
		// TODO Auto-generated method stub
		return null;
	}

}
