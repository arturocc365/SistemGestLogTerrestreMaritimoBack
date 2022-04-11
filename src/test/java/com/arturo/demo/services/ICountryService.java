package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Country;


public interface ICountryService {
	public List<Country> finAll();

	public Country findById(Long id);
}
