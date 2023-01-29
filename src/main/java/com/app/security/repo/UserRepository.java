package com.app.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.security.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);

}
