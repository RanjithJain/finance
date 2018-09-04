package com.spring.finance.dao;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean checkLogin(String userName, String userPassword) {
		System.out.println("In Check login");

		boolean userFound = false;
		Session session = sessionFactory.openSession();
		// Query using Hibernate Query Language
		System.out.println(userName);
		String SQL_QUERY = "from User as o where o.username=? and o.password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, userName);
		query.setParameter(1, userPassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		session.close();
		return userFound;
	}
}
