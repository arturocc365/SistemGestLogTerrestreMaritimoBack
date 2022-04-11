package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.model.entity.RoleMenu;
import com.arturo.demo.model.entity.key.RoleMenuKey;

public interface IRoleMenuDAO extends CrudRepository<RoleMenu, RoleMenuKey> {
	@Query(value ="SELECT new com.sunqu.projects.ecommerce.model.entity.RoleMenu(rm.menu,rm.disabled) "
			+ "FROM RoleMenu rm " + "WHERE rm.id.roleId= ?1" )
	List<RoleMenu> findAllByRoleId(Integer role_id);
	
	
	@Transactional
	@Modifying
	@Query(value="delete RoleMenu rm where rm.id.roleId= ?1",nativeQuery=true)
	public void deleteAllByRoleId(Integer role_id);	
}
