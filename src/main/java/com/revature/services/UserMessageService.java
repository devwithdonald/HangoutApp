package com.revature.services;

import java.util.List;

import com.revature.beans.User;
import com.revature.beans.UserMessage;

public interface UserMessageService {
	public void saveMessage(UserMessage userMessage, int senderId, int receiverId);
	public void sendMessage(UserMessage userMessage, int receiverId);
	public List<UserMessage> getAllMessagesForUser(User user);

}
