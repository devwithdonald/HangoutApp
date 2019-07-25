package com.revature.dao;

import java.util.List;

import com.revature.beans.BasicUser;
import com.revature.beans.Event;
import com.revature.beans.Rsvp;
import com.revature.beans.RsvpDTO;

public interface RsvpDao {
	
	public boolean addRSVP(RsvpDTO rsvp);
	
	public boolean rejectRSVP(RsvpDTO rsvp);
	
	public Rsvp getRSVPbyUser(BasicUser user);
	
	public List<Rsvp> getAllRSVPsByEvent(Event event);
	
	public List<Rsvp> getRecentRSVPsByUser(BasicUser user);
	
	public Rsvp getRSVPbyUserandEvent(BasicUser user, Event event);
	
}
