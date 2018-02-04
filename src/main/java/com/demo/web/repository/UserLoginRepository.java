/**
 * 
 */
package com.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpa.model.User;

/**
 * @author mishrani
 *
 */

@Repository
public interface UserLoginRepository extends JpaRepository<User,Long>, UserLoginRepositoryCustom{

}
