package com.crm.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crm.jpa.model.User;

/**
 * 
 * @author Nikhil
 * 22-Jan-2018
 */

@RestController
public class LoginController {

	//private LoginService;
	
	@PostMapping("/login")
	public void login(@RequestParam String username, @RequestParam String password) {
		userService.add(user);
	}
}
