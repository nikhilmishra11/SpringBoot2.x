package com.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
