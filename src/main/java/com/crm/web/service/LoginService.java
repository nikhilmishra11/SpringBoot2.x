/**
 * 
 */
package com.crm.web.service;

import com.crm.jpa.model.User;

/**
 * @author Nikhil
 * 27-Jan-2018
 */
public interface LoginService {

	public User login(String username, String password);
}
