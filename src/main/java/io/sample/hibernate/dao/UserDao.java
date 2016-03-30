package io.sample.hibernate.dao;

import java.util.List;

import io.sample.hibernate.entity.User;

public interface UserDao {
	public User findByName(String name);
	public List<User> findAll();
}