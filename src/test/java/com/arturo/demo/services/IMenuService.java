package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Menu;


public interface IMenuService {
	public List<Menu> findAll();

	public List<Menu> findByRoleId(Integer role_id);

	public Menu findById(Integer id);

	public Menu save(Menu menu);

	public void delete(Integer id);
}
