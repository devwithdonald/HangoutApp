package com.revature.services;

import com.revature.beans.EventMessage;

public interface EventMessageService {
	public void saveEventMessage(EventMessage eventMessage, int SenderId, String timeStamp);
	public void sendEventMessage(EventMessage eventMessage, String senderName);
}