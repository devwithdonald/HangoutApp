package com.revature.dao;

import java.util.List;

import com.revature.beans.BasicUser;
import com.revature.beans.BusinessUser;
import com.revature.beans.Subscriptions;

public interface SubscriptionDao {
	
	public List<Subscriptions>getSubscriptionsByUser(BasicUser user);
	
	public List<Subscriptions>getSubscriptionsByBusiness(BusinessUser user);
	
	public void addSubscription(Subscriptions sub);
	
	public void deleteSubscription(Subscriptions sub);

}