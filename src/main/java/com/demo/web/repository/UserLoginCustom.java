/**
 * 
 */
package com.demo.web.repository;

import com.demo.jpa.model.User;

/**
 * @author mishrani
 *
 */
public interface UserLoginCustom {

	public User getUser(String username, String password);
}
