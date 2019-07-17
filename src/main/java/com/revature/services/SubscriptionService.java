package com.revature.services;

import java.util.List;

import com.revature.beans.BasicUser;
import com.revature.beans.BusinessUser;
import com.revature.beans.Subscriptions;

public interface SubscriptionService {
	
	public void addSubscription(Subscriptions subscription);
	public void deleteSubscription(Subscriptions subscription);
	public List<Subscriptions>getSubscriptionsByUser(BasicUser basicUser);
	public List<Subscriptions>getSubscriptionsByBusiness(BusinessUser businessUser);
	

}
