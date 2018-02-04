/**
 * 
 */
package com.demo.web.repository;

import com.demo.jpa.model.LoginUser;
import com.demo.jpa.model.User;

/**
 * @author mishrani
 *
 */
public interface UserLoginRepositoryCustom {

	public User getUser(LoginUser loginUser);
}
