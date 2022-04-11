package com.arturo.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.Role;

public interface IRoleDAO extends CrudRepository<Role, Integer>{
	public Optional<Role> findByRol(String rol);

	public List<Role> findByAccountId(Long id);	
}
