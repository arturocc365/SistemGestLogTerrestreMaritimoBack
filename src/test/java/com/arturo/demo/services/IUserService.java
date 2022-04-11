package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.User;


public interface IUserService {
	public List<User> finAll();

	public List<User> findByAccountId(Long id);

	public User findById(Long id);

	public User findByEmail(String email);

	public User save(User user);

	public void delete(Long id);
}
