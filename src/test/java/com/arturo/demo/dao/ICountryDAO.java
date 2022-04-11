package com.arturo.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.Country;

public interface ICountryDAO extends CrudRepository<Country, Long>{

}
