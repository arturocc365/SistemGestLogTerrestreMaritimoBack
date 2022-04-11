package com.arturo.demo.model.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 10)
	private String guide_number; // numero de guia
	
	@Column
	private Float totalAmount; // cantidad total
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date deliveryDate;
	
	@ManyToOne
	@JoinColumn(name="ubicartion_district")
	private Container ubication_district; // bodega oh flota, distrito de evnio
	
	@Column
	private Float shipping_price; // precio de envio
	
	
	@Column(length = 20)
	private String status; // estado de envio
	
	@Column(length = 50)
	private String statusDetail; // detalle del estado de envio
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="trans_id", nullable=true)
	private transport transport;
	
	@OneToMany(mappedBy="order")
	private List<OrderDetail> details;
	
	@ManyToOne
	@JoinColumn(name="beneficiary_account_id")
	private Account account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGuide_number() {
		return guide_number;
	}

	public void setGuide_number(String guide_number) {
		this.guide_number = guide_number;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Container getUbication_district() {
		return ubication_district;
	}

	public void setUbication_district(Container ubication_district) {
		this.ubication_district = ubication_district;
	}

	public Float getShipping_price() {
		return shipping_price;
	}

	public void setShipping_price(Float shipping_price) {
		this.shipping_price = shipping_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public transport getTransport() {
		return transport;
	}

	public void setTransport(transport transport) {
		this.transport = transport;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}