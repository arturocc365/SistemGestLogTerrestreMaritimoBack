package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.ICountryDAO;
import com.arturo.demo.model.entity.Country;
import com.arturo.demo.services.ICountryService;

@Service
public class CountryService implements ICountryService{
	@Autowired
	private ICountryDAO paisDAO;
	
	@Override
	public List<Country> finAll() {
		return (List<Country>) paisDAO.findAll();
	}
	
	@Override
	public Country findById(Long id) {
		return paisDAO.findById(id).orElse(null);
	}

}
