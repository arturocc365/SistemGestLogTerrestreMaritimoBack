package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.dao.IRoleDAO;
import com.arturo.demo.model.entity.Role;
import com.arturo.demo.services.IRoleService;



@Service
public class RoleService implements IRoleService{
	
	@Autowired
	private IRoleDAO roleDAO;

	@Override
	public List<Role> findAll() {
		return (List<Role>) roleDAO.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Role findById(Integer id) {
		return roleDAO.findById(id).orElse(null);
	}

	@Override
	public Role save(Role role) {
		return roleDAO.save(role);
	}

	@Override
	public void delete(Integer id) {
		roleDAO.deleteById(id);
	}

	@Override
	public Role findByName(String rol) {
		return roleDAO.findByRol(rol).orElse(null);
	}

	@Override
	public List<Role> findByAccountId(Long id) {
		return roleDAO.findByAccountId(id);
	}
	
	
}
