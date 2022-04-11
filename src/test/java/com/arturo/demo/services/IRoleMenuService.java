package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.RoleMenu;
import com.arturo.demo.model.entity.key.RoleMenuKey;


public interface IRoleMenuService {
	RoleMenu save(RoleMenu roleMenu);

	RoleMenu findById(RoleMenuKey id);

	List<RoleMenu> findAllByRoleId(Integer role_id);

	void deleteAllByRoleId(Integer role_id);
}
