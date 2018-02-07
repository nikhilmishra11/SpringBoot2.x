/**
 * 
 */
package com.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.model.User;
import com.demo.web.service.UserService;

/**
 * @author mishrani
 *
 */
@RestController
public class UsersController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAll() {
		return userService.getAll();
	}

	@GetMapping("/users/{noOfUsers}")
	public List<User> get(@PathVariable("noOfUsers") Long noOfUsers) {
		return userService.getAll();
	}
	
	@GetMapping("/users/{firstIndex}/{lastIndex}")
	public List<User> get(@PathVariable("firstIndex") Long firstIndex, @PathVariable("firstIndex") Long lastIndex) {
		return userService.getAll();
	}
	
	@GetMapping("/users/createdBy/{createdBy}")
	public List<User> getAllUsersCreatedBy(@PathVariable("createdBy") Long createdBy) {
		return userService.getAll();
	}
}
