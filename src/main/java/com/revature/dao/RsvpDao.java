package com.revature.dao;

import java.util.List;

import com.revature.beans.BasicUser;
import com.revature.beans.Event;
import com.revature.beans.Rsvp;

public interface RsvpDao {
	
	public void addRSVP(Rsvp rsvp);
	
	public Rsvp getRSVPbyUser(BasicUser user);
	
	public List<Rsvp> getAllRSVPsByEvent(Event event);
	
	public List<Rsvp> getRecentRSVPsByUser(BasicUser user);
	
}
