/**
 * 
 */
package com.demo.web.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.jpa.model.LoginUser;
import com.demo.jpa.model.User;
import com.demo.web.repository.UserLoginRepositoryCustom;

/**
 * @author mishrani
 *
 */
@Repository
@Transactional(readOnly = true)
public class UserLoginRepositoryCustomImpl implements UserLoginRepositoryCustom {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public User getUser(LoginUser loginUser) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.where(
				criteriaBuilder.equal(root.get("username"), criteriaBuilder.parameter(String.class, "username")), 
				criteriaBuilder.equal(root.get("password"), criteriaBuilder.parameter(String.class, "password")
			)
		);
		Query query = entityManager.createQuery(criteriaQuery);
		query.setParameter("username", loginUser.getUsername());
		query.setParameter("password", loginUser.getPassword());
		
		User user = (User)query.getSingleResult();

		return user;
	}
}
