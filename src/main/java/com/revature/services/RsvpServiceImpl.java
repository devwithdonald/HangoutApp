package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.BusinessUser;
import com.revature.beans.Event;
import com.revature.beans.Rsvp;
import com.revature.beans.RsvpDTO;
import com.revature.beans.User;
import com.revature.dao.RsvpDao;

@Component
public class RsvpServiceImpl implements RsvpService {

	
	//private RsvpDaoImpl rsvpdao = new RsvpDaoImpl();
	private RsvpDao rsvpDao;
	
	@Autowired
	private void setRsvpDao(RsvpDao rsvpDao) {
		this.rsvpDao = rsvpDao;
	}

	
	@Override
	public boolean addRsvp(RsvpDTO rsvp) {
		return rsvpDao.addRSVP(rsvp);
	}

	@Override
	public boolean rejectRsvp(RsvpDTO rsvp) {
		return rsvpDao.rejectRSVP(rsvp);
	}

	@Override
	public List<Rsvp> getAllRsvps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rsvp> getAllRsvpsByEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rsvp> getAllRsvpsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rsvp> getAllUserRsvpsByBusiness(BusinessUser businessUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
