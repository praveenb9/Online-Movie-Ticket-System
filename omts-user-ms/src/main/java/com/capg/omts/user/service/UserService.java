package com.capg.omts.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.User;
import com.capg.omts.user.repo.UserRepo;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public Admin addUser(Admin admin) {
		// TODO Auto-generated method stub
		return userRepo.save(admin);
	}

	@Override
	public User getUserByUserIdAndPassword(int userId, String password) {
		// TODO Auto-generated method stub
		return userRepo.findByUserIdAndPassword(userId, password);
	}

}
