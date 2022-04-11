package com.arturo.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.Order;

public interface IOrderDAO extends CrudRepository<Order, Long> {

}
