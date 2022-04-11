package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Role;

public interface IRoleService {
	public List<Role> findAll();

	public List<Role> findByAccountId(Long id);

	public Role findById(Integer id);

	public Role findByName(String rol);

	public Role save(Role role);

	public void delete(Integer id);
}
