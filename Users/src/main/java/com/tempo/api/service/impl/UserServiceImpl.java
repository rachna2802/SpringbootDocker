package com.tempo.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tempo.api.dao.UserRepository;
import com.tempo.api.error.UserNotFoundException;
import com.tempo.api.model.User;
import com.tempo.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepo;
	Logger log= LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveUser(User user) {
		log.info("saving user info");
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		log.info("get list of all users");
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findUserById(Long userId) throws UserNotFoundException {
		log.info("finding userById");
		Optional<User> user= userRepo.findById(userId);
		if(!user.isPresent()) {
			throw new UserNotFoundException("User not present");
		}else {
			return user.get();
		}
	}
	
	public String getfindUserFirstNameByLocation(String location) {
		return userRepo.getUserFirstNameBylocation(location);
		
	}

	

}
