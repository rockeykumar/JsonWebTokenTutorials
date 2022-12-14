package com.vs24.springsecurityjwtexample.repository;

import com.vs24.springsecurityjwtexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
