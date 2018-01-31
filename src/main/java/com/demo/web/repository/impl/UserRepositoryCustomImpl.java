/**
 * 
 */
package com.demo.web.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.jpa.model.User;
import com.demo.web.repository.UserLoginCustom;

/**
 * @author mishrani
 *
 */
@Repository
@Transactional(readOnly = true)
public class UserRepositoryCustomImpl implements UserLoginCustom {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public User getUser(String username, String password) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder<User>.createQuery();
		Root employee = criteriaQuery.from(User.class);
		criteriaQuery.where(criteriaBuilder.greaterThan(employee.get("salary"), 100000));
		Query query = entityManager.createQuery(criteriaQuery);
		List<User> result = query.getResultList();

		return null;
	}
}
