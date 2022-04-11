package com.arturo.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.OrderDetail;

public interface IOrderDetailDAO extends CrudRepository<OrderDetail, Long>{

}
