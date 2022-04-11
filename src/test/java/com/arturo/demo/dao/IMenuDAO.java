package com.arturo.demo.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.Menu;

public interface IMenuDAO extends CrudRepository<Menu, Integer>{
	@Query(value = "SELECT m.* FROM roles_menus rm " +
			   "INNER JOIN menus m on (rm.menu_id=m.id) " + 
			   "WHERE rm.role_id= ?1",
		   nativeQuery=true
	)
	public Collection<Menu> findByRoleId(Integer role_id);
}
