package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.OrderDetail;


public interface IOrderDetailService {
	public List<OrderDetail> findAll();

	public OrderDetail findById(Long id);

	public OrderDetail save(OrderDetail orderDetail);

	public void delete(Long id);
}
