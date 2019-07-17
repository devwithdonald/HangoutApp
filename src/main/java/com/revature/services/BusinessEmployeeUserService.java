package com.revature.services;

import com.revature.beans.BusinessEmployeeUser;
import com.revature.beans.BusinessMessage;

public interface BusinessEmployeeUserService {
	public void addBusinessEmployee(int businessId, BusinessEmployeeUser businessEmployeeUser);
	public BusinessEmployeeUser getEmployeeByID(int businessEmployeeId);
	public BusinessEmployeeUser getEmployeeByUsername(String username);
	public BusinessMessage getActiveMessage();
	

}
