package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.User;

public interface IUserDAO extends CrudRepository<User, Long> {
	public User findByEmail(String email);

	public List<User> findByAccountId(Long id);
}
