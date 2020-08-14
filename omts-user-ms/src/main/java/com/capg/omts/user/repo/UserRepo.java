package com.capg.omts.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.omts.user.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByUserIdAndPassword(int userId,String password);

}
