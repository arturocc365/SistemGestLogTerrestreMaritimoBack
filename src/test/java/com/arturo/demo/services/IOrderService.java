package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Order;


public interface IOrderService {
	public List<Order> findAll();

	public Order findById(Long id);

	public Order save(Order order);

	public void delete(Long id);
}
