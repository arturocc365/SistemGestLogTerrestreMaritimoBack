package com.arturo.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "products" )
public class Product {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@NotNull(message = "Name is required.")
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
	@Column
	private Integer unit;
	
	@Column
	private Integer total_quantity;
	
	@Column()
	private double unit_price;
	
	@Column()
	private double total_price;
	
	@Column
	private String picture;
	
	@ManyToOne
	@JoinColumn(name="subcategory_id", nullable = true)
	private SubCategory subcategory;
	
	@Column( columnDefinition = "boolean default false" )
	private boolean deleted;
	
	@ManyToOne
	@JoinColumn( name = "account_id" , nullable = false )
	private Account account;
	
	public Long _getAccountId() {
		return this.account.getId();
	}

	public void setAccount(Account account) {
		this.account = account;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	public Integer getTotal_quantity() {
		return total_quantity;
	}

	public void setTotal_quantity(Integer total_quantity) {
		this.total_quantity = total_quantity;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public SubCategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubCategory subcategory) {
		this.subcategory = subcategory;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	/*@ManyToOne
	@JoinColumn( name = "account_id" , nullable = false )
	private Account account;
	
	public Long _getAccountId() {
		return this.account.getId();
	}

	public void setAccount(Account account) {
		this.account = account;
	}*/
		
}
