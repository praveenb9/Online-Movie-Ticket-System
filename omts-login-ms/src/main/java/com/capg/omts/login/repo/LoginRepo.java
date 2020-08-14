package com.capg.omts.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.omts.login.model.User;

public interface LoginRepo extends JpaRepository<User, Integer>{
	
}
