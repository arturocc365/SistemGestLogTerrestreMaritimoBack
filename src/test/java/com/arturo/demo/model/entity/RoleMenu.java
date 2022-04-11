package com.arturo.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.arturo.demo.model.entity.key.RoleMenuKey;


@Entity
@Table( name = "roles_menus" )
public class RoleMenu {
	@Id
	@EmbeddedId
	private RoleMenuKey id;
	
	@ManyToOne
	@MapsId("role_id")
	@JoinColumn(name="role_id")
	private Role role;
	
	@ManyToOne
	@MapsId("menu_id")
	@JoinColumn(name="menu_id")
	private Menu menu;
	
	@Column( columnDefinition = "boolean default false"  )  
	private boolean disabled;
	
	public RoleMenu() {};
	
	public RoleMenu(Menu m, boolean d) {
		this.menu = m;
		this.disabled = d;
	}

	public RoleMenuKey getId() {
		return id;
	}

	public void setId(RoleMenuKey id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	@Override
	public String toString() {
		return "RoleMenu [id=" + id + ", role=" + role + ", menu=" + menu + ", disabled=" + disabled + "]";
	};
	
	
}
