package com.demo.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.model.LoginUser;
import com.demo.jpa.model.User;

/**
 * 
 * @author Nikhil
 * 22-Jan-2018
 */

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LoginController {

	//private LoginService;
	
	@PostMapping("/login")
	public User login(@RequestBody LoginUser loginUser) {
		System.out.println("User Login");
		User user = new User();
		System.out.println("username : "+loginUser);
		//userid: number;
	    //username: string;
	    //password: string;
	    //firstName: string;
	    //lastName: string;
		user.setUserId(1l);
		user.setUsername(loginUser.getUsername());
		user.setFirstName("Nikhil");
		user.setLastName("Mishra");
		user.setEmailId("nikhil.mishra@harman.com");
		
		return user;
	}
	
	@GetMapping("/login1")
	public User login() {
		System.out.println("User Login");
		User user = new User();
		
		user.setFirstName("Nikhil");
		user.setLastName("Mishra");
		user.setEmailId("nikhil.mishra@harman.com");
		
		return user;
	}
}
