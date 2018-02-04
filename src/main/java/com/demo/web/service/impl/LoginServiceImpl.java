/**
 * 
 */
package com.demo.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jpa.model.LoginUser;
import com.demo.jpa.model.User;
import com.demo.web.repository.UserLoginRepository;
import com.demo.web.service.LoginService;

/**
 * @author Nikhil
 * 27-Jan-2018
 */

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Override
	public User login(LoginUser loginUser) {
		return userLoginRepository.getUser(loginUser);
	}

}
