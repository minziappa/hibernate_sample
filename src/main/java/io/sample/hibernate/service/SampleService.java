package io.sample.hibernate.service;

import java.util.List;

import io.sample.hibernate.entity.User;

public interface SampleService {

	public User getName(String name);
	public List<User> getAll();

}