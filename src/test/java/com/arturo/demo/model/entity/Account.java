package com.arturo.demo.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "accounts" )
public class Account {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String name;
	
	private String logo;
	
	private String name_contact;
	
	private String phone_contact;
	
	private String email_contact;
	
	/*@OneToMany( mappedBy = "account" )
	private List<User> users;
	
	@OneToMany( mappedBy = "account" )
	private List<Category> categories;
	
	@OneToMany( mappedBy = "account" )
	private List<Product> products;
	
	@OneToMany( mappedBy = "account" )
	private	List<Order> orders;
	
	@ManyToOne
	@JoinColumn(name = "plan_id", nullable = true)
	private Plan plan;*/

	public Account() {
	}

	/*public Account(String name, String logo, String name_contact, String phone_contact, String email_contact, Plan plan) {
		this.name = name;
		this.logo = logo;
		this.name_contact = name_contact;
		this.phone_contact = phone_contact;
		this.email_contact = email_contact;
		this.plan = plan;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName_contact() {
		return name_contact;
	}

	public void setName_contact(String name_contact) {
		this.name_contact = name_contact;
	}

	public String getPhone_contact() {
		return phone_contact;
	}

	public void setPhone_contact(String phone_contact) {
		this.phone_contact = phone_contact;
	}

	public String getEmail_contact() {
		return email_contact;
	}

	public void setEmail_contact(String email_contact) {
		this.email_contact = email_contact;
	}

	/*public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}*/

}
