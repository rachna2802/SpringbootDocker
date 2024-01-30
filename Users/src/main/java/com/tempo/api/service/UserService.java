package com.tempo.api.service;

import java.util.List;

import com.tempo.api.error.UserNotFoundException;
import com.tempo.api.model.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getAllUsers();

	public User findUserById(Long userId) throws UserNotFoundException;

	public String getfindUserFirstNameByLocation(String location);



	//public User findUserById(Long userId);


}
