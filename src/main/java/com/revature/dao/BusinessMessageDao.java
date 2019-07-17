package com.revature.dao;

import com.revature.beans.BusinessMessage;

public interface BusinessMessageDao {

	public void saveMessage(BusinessMessage businessMessage, int businessId);
	
	public void sendMessage(String message, int employeeId, int businessId);
	
	public BusinessMessage getBusinessMessageByBusiness(int businessId);
	

}