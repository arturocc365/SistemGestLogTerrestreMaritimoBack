package com.arturo.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arturo.demo.services.IRoleService;
import com.arturo.demo.services.impl.UserService;



@RestController
@RequestMapping("/api/account")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private IRoleService roleService;
	
	@GetMapping("/user")
	public ResponseEntity<?> findByAccountId(@PathVariable Long account_id){
		Map<String, Object> response = new HashMap<String, Object>();
		
		response.put("user", this.userService.findByAccountId(account_id));
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	
}
