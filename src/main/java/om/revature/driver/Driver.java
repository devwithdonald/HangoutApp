package om.revature.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.BasicUser;
import com.revature.dao.UserDaoImpl;
import com.revature.util.SessionFactoryUtil;

public class Driver {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private static UserDaoImpl udi = new UserDaoImpl();

	public static void main(String[] args) {
		Session sess = sf.openSession();
		BasicUser us = (BasicUser) sess.get(BasicUser.class, 1);
		System.out.println(us.toString());
		
		//List<User> user = udi.getAllUsers1();
		sess.close();
		System.out.println("Everything fine");
		
		
		
	}

}
