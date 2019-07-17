    package com.revature.dao;

import java.util.List;

import com.revature.beans.UserMessage;

public interface UserMessageDao {
	
	public void saveMessage(UserMessage userMessage, int senderId, int recieverId);

	public void sendMessage(UserMessage userMessage, int recieverId);
	
	public List<UserMessage> getAllMessageByUsername(String username);


}