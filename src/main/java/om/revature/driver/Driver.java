package om.revature.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.BasicUser;
import com.revature.beans.User;
import com.revature.dao.UserDaoImpl;
import com.revature.util.SessionFactoryUtil;

public class Driver {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static UserDaoImpl udi = new UserDaoImpl();

	public static void main(String[] args) {
		Session sess = sf.openSession();
//		User us = (User) sess.get(User.class, 1);
//		System.out.println(us.toString());
		
		List<User> user = udi.getAllUsers1();
		System.out.println(user);
		sess.close();
		System.out.println("Everything fine");
		
		
		
	}

}
