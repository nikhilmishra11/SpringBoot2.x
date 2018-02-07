/**
 * 
 */
package com.demo.web.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jpa.model.User;
import com.demo.web.repository.UserRepository;
import com.demo.web.service.UserService;

/**
 * @author Nikhil
 * 22-Jan-2018
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User get(Long userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public void add(User user) {
		if(null==user.getCreatedBy()) {
			user.setCreatedBy(user.getUsername());
		}
		user.setCreatedDate(new Date());
		if(null==user.getModifiedBy()) {
			user.setModifiedBy(user.getUsername());
		}
		user.setModifiedDate(new Date());
		userRepository.save(user);
	}

	@Override
	public void update(Long userId, User user) {
		User userExits = userRepository.findById(userId).get();
		user.setUserId(userId);
		if(null!= userExits) {
			userRepository.save(user);
		}
	}

	@Override
	public void delete(Long userId) {
		userRepository.deleteById(userId);
	}
	
	
}
