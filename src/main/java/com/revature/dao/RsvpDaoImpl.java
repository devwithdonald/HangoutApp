package com.revature.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.revature.beans.BasicUser;
import com.revature.beans.Event;
import com.revature.beans.Rsvp;
import com.revature.beans.RsvpDTO;
import com.revature.util.SessionFactoryUtil;

@Component
public class RsvpDaoImpl implements RsvpDao {

	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	@Override
	public boolean addRSVP(RsvpDTO rsvp) {
		Session sess = sf.openSession();
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Rsvp rsvps = ac.getBean("rsvp", Rsvp.class);
		Transaction tx = sess.beginTransaction();
		if(getRSVPbyUserandEvent(rsvp.getUser(), rsvp.getEvent()) != null) {
			sess.close();
			return false;
		}
		System.out.println(rsvp.getEvent().getEventId());
		
		log.log(Level.INFO,"rsvp user id: " +rsvp.getUser().getUserId());
		sess.save(new Rsvp(sess.load(Event.class, rsvp.getEventId()), sess.load(BasicUser.class, rsvp.getUser().getUserId())));
		tx.commit();
		sess.close();
		return true;
	}

	@Override
	public boolean rejectRSVP(RsvpDTO rsvp) {
		Session sess = sf.openSession();

		String hql = "DELETE FROM Rsvp as r WHERE r.basicUser = :userid AND r.event = :eventid";

		Query query = sess.createQuery(hql);

		query.setParameter("userid", rsvp.getUser().getUserId());
		query.setParameter("eventid", rsvp.getEvent().getEventId());

		try {
			query.executeUpdate();
		} catch (NoResultException e) {
			sess.close();
			return false;
		}

		sess.close();
		return true;
	}

	@Override
	public Rsvp getRSVPbyUser(BasicUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rsvp> getAllRSVPsByEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rsvp> getRecentRSVPsByUser(BasicUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rsvp getRSVPbyUserandEvent(BasicUser user, Event event) {
		log.log(Level.INFO, "inside getRSVPbyuser/event");
		Session sess = sf.openSession();
		Rsvp rsvp = null;
		
		Query query = sess.createQuery("FROM Rsvp AS r WHERE r.basicUser =:userid AND r.event =:eventid");
		query.setParameter("userid", sess.load(user.getClass(), user.getUserId()));
		query.setParameter("eventid", sess.load(event.getClass(), event.getEventId()));
		try {
			rsvp = (Rsvp) query.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
		return rsvp;
	}

}
