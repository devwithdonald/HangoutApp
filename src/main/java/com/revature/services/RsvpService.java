package com.revature.services;

import java.util.List;

import com.revature.beans.BusinessUser;
import com.revature.beans.Event;
import com.revature.beans.Rsvp;
import com.revature.beans.User;

public interface RsvpService {
	
	public boolean addRsvp(Rsvp rsvp);
	
	public boolean deleteRsvp(Rsvp rsvp);
	
	public List<Rsvp> getAllRsvps();
	
	public List<Rsvp> getAllRsvpsByEvent(Event event);
	
	public List<Rsvp> getAllRsvpsByUser(User user);
	
	public List<Rsvp> getAllUserRsvpsByBusiness(BusinessUser businessUser);

}
