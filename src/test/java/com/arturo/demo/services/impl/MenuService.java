package com.arturo.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IMenuDAO;
import com.arturo.demo.model.entity.Menu;
import com.arturo.demo.services.IMenuService;



@Service
public class MenuService implements IMenuService{

	@Autowired
	private IMenuDAO menuDao;

	@Override
	public List<Menu> findByRoleId(Integer role_id) {
		return new ArrayList<Menu>(menuDao.findByRoleId(role_id));
	}

	@Override
	public Menu save(Menu menu) {
		return menuDao.save(menu);
	}

	@Override
	public void delete(Integer id) {
		menuDao.deleteById(id);
	}

	@Override
	public List<Menu> findAll() {
		return (List<Menu>) menuDao.findAll();
	}

	@Override
	public Menu findById(Integer id) {
		return menuDao.findById(id).orElse(null);
	}


}
