package com.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.model.User;
import com.demo.web.service.UserService;

/**
 * 
 * @author Nikhil
 * 22-Jan-2018
 */

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> get() {
		return userService.getAll();
	}
	
	@GetMapping("/user/{id}")
	public User get(@PathVariable("id") Long userId) {
		return userService.get(userId);
	}
	
	@PostMapping("/user")
	public void create(@RequestBody User user) {
		userService.add(user);
	}
	
	@PutMapping("/user/{id}")
	public void update(@PathVariable("id") Long userId, @RequestBody User user) {
		userService.update(userId, user);
	}
	
	@DeleteMapping("/user/{id}")
	public void update(@PathVariable("id") Long userId) {
		userService.delete(userId);
	}
}

