package com.revature.dao;

import com.revature.beans.BusinessEmployeeUser;
import com.revature.beans.BusinessMessage;

public interface BusinessEmployeeUserDao {

	public void addBusinessEmployee(int businessId, BusinessEmployeeUser user);
	
	public BusinessEmployeeUser getEmployeeByID(int businessEmployeeId);
	
	public BusinessEmployeeUser getEmployeeByUsername(String username);
	
	public BusinessMessage getActiveMessage();
	
}