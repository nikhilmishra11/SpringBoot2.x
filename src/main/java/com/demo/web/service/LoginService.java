/**
 * 
 */
package com.demo.web.service;

import com.demo.jpa.model.LoginUser;
import com.demo.jpa.model.User;

/**
 * @author Nikhil
 * 27-Jan-2018
 */
public interface LoginService {

	public User login(LoginUser loginUser);
}
