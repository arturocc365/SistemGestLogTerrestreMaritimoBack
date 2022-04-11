package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IOrderDetailDAO;
import com.arturo.demo.model.entity.OrderDetail;
import com.arturo.demo.services.IOrderDetailService;


@Service
public class OrderDetailService implements IOrderDetailService{
	@Autowired
	private IOrderDetailDAO orderDetailDAO;
	
	@Override
	public List<OrderDetail> findAll() {
		return (List<OrderDetail>) orderDetailDAO.findAll();
	}

	@Override
	public OrderDetail findById(Long id) {
		return orderDetailDAO.findById(id).orElse(null);
	}

	@Override
	public OrderDetail save(OrderDetail orderDetail) {
		return orderDetailDAO.save(orderDetail);
	}

	@Override
	public void delete(Long id) {
		orderDetailDAO.deleteById(id);
	}

}
