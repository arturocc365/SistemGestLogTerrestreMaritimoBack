package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IOrderDAO;
import com.arturo.demo.model.entity.Order;
import com.arturo.demo.services.IOrderService;


@Service
public class OrderService implements IOrderService{

	@Autowired
	private IOrderDAO orderDAO;

	@Override
	public List<Order> findAll() {
		return (List<Order>) orderDAO.findAll();
	}

	@Override
	public Order findById(Long id) {
		return orderDAO.findById(id).orElse(null);
	}

	@Override
	public Order save(Order order) {
		return orderDAO.save(order);
	}

	@Override
	public void delete(Long id) {
		orderDAO.deleteById(id);
	}
	
	
}
