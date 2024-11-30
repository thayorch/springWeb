package com.martinez.webspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinez.webspring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
