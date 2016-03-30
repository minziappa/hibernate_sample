package io.sample.hibernate.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sample.hibernate.dao.UserDao;
import io.sample.hibernate.entity.User;
import io.sample.hibernate.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getName(String name) {
		User user = userDao.findByName(name);
		return user;
	}

	@Transactional
	@Override
	public List<User> getAll() {
		List<User> userList = userDao.findAll();
		for(User user : userList) {
			System.out.println("user >>> " + user.getEmail());
		}

		return userList;
	}

}