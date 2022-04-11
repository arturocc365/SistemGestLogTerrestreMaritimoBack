package com.arturo.demo.services.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IUserDAO;
import com.arturo.demo.model.entity.User;
import com.arturo.demo.services.IMenuService;
import com.arturo.demo.services.IUserService;
// import com.auth0.jwt.JWT;



@Service
public class UserService implements IUserService { // ,UserDetailsService {
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private IUserDAO userDAO;
	
	@Autowired
	private IMenuService menuService;

	@Override
	public List<User> finAll() {
		// TODO Auto-generated method stub
		return (List<User>) userDAO.findAll();
	}

	@Override
	public List<User> findByAccountId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id).orElse(null);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.findByEmail(email);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userDAO.deleteById(id);
	}

	/*public String generateJwt(User user) {
		String token = JWT.create()
		.withClaim("id", user.getId())
		.withClaim("first_name",user.getFirst_name())
		.withClaim("last_name", user.getLast_name())
		.withClaim("email", user.getEmail())
		.withClaim("picture", user.getPicture())
		.withArrayClaim("authorities", new String[]{user.getRole().getRol()})
		.withClaim("menus", menuService.findByRoleId(user.getRole().getId()))
		.withExpiresAt(new Date(System.currentTimeMillis() + 3600*24*1000) )
		.sign(com.auth0.jwt.algorithms.Algorithm.HMAC256("Masha.1897.Leo.Key"));
		return token;
	}*/
}
