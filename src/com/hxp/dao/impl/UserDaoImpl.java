package com.hxp.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.hxp.dao.UserDao;
import com.hxp.model.User;

@Component
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User getUser(User u) {
		Session session = sessionFactory.getCurrentSession();
		String hql="from User as a where a.name=:name and a.password=:password";
		Query query = session.createQuery(hql);
		query.setString("name", u.getName());
		query.setString("password", u.getPassword());
		User user = (User) query.uniqueResult();
		return user;
	}
}
