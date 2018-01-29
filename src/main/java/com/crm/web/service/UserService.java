/**
 * 
 */
package com.crm.web.service;

import java.util.List;

import com.crm.jpa.model.User;

/**
 * @author Nikhil
 * 22-Jan-2018
 */
public interface UserService {

	public List<User> getAll();
	
	public User get(Long userId);
	
	public void add(User user);
	
	public void update(Long userId, User user);
	
	public void delete(Long userId);

}
