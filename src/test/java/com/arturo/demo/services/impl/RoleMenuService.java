package com.arturo.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IRoleMenuDAO;
import com.arturo.demo.model.entity.RoleMenu;
import com.arturo.demo.model.entity.key.RoleMenuKey;
import com.arturo.demo.services.IRoleMenuService;


@Service
public class RoleMenuService implements IRoleMenuService{
	
	@Autowired
	private IRoleMenuDAO roleMenuDAO;

	@Override
	public RoleMenu save(RoleMenu roleMenu) {
		return roleMenuDAO.save(roleMenu);
	}

	@Override
	public RoleMenu findById(RoleMenuKey id) {
		return roleMenuDAO.findById(id).orElse(null);
	}

	@Override
	public List<RoleMenu> findAllByRoleId(Integer role_id) {
		return new ArrayList<RoleMenu>(this.roleMenuDAO.findAllByRoleId(role_id));	
	}

	@Override
	public void deleteAllByRoleId(Integer role_id) {
		// TODO Auto-generated method stub
		this.roleMenuDAO.deleteAllByRoleId(role_id);
	}
	
	
}
