package com.arturo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arturo.demo.services.IRoleService;
import com.arturo.demo.services.impl.UserService;


@RestController
@RequestMapping("/api/order")
public class OrderController {
	@Autowired
	private UserService userService;

	@Autowired
	private IRoleService roleService;
	
	
}
