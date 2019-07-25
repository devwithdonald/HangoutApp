package com.revature.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.revature.beans.BasicUser;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class FriendsDaoImpl implements FriendsDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	@Override
	public User getFriendByFriendId(User user, int friendId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addFriend(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFriend(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	// TODO may need List<User>
	@Override
	public User getAllFriendsByUserId(int userId) {
		Session sess = sf.openSession();
		User returnedUser = null;
//		System.out.println("user id" + user.getUserId());
		Criteria crit = sess.createCriteria(BasicUser.class).add(Restrictions.eq("userId", userId));
		List<User> result = crit.list();
		
		for (User u : result) {
			System.out.println(u);
		}
		
		
		if (result.size() > 1) {
			for (int i = result.size(); i > 1; i--) {
				result.remove(i - 1);
			}
		}
		
		//getting single user 
		if(result.size() == 1) {
			returnedUser =  result.get(0);
		}
		
		
		sess.close();
		
		return returnedUser;
		
	}

}
