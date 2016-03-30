package io.sample.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.sample.hibernate.dao.UserDao;
import io.sample.hibernate.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

	@Override
	public User findByName(String name) {

        return null;
	}

	@Override
	public List<User> findAll() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		List<User> userList = criteria.list();
		session.getTransaction().commit();
        return userList;
	}

}
