package com.cdac.daosImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cdac.daos.UserDao;
import com.cdac.models.User;


@Repository("UserDao")
@Component
public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	
	public void UserRegister(User user) {
		
		Session session= sessionFactory.getCurrentSession();
		session.save(user);
	
	}

}
