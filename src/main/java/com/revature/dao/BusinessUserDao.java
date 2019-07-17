package com.revature.dao;

import java.util.List;

import com.revature.beans.BusinessUser;

public interface BusinessUserDao {
	
	public void addBusiness(BusinessUser businessUser);
	
	public BusinessUser getBusinessById(int Id);
	
	public List<BusinessUser> getAllBusiness();

}