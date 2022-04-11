package com.arturo.demo.model.entity.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RoleMenuKey implements Serializable {
	@Column( name = "role_id" )
	private Integer roleId;
	
	@Column( name = "menu_id" )
	private Integer menuId;
	
	public RoleMenuKey() {}
	
	public RoleMenuKey(Integer role_id, Integer menu_id) {
		this.roleId = role_id;
		this.menuId = menu_id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "RoleMenuKey [roleId=" + roleId + ", menuId=" + menuId + "]";
	}
	
	
}
