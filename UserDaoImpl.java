package com.ranps.proc.daosImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ranps.proc.daos.UserDao;
import com.ranps.proc.models.UserRegistration;

@Repository("UserDao")
@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void registerUser(UserRegistration user) {
		
		Session session = sessionFactory.getCurrentSession();
		 session.save(user);
		
	}

	public void validateUser(String email, String uname) {
		

		Session session = sessionFactory.getCurrentSession();
		
		
	}

}
