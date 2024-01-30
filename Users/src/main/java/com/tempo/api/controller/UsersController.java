package com.tempo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tempo.api.error.UserNotFoundException;
import com.tempo.api.model.User;
import com.tempo.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UsersController {
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/findAll")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	
	@GetMapping("find/{Id}")
	public User findUserById(@PathVariable("Id") Long userId) throws UserNotFoundException {
		return userService.findUserById(userId);
	}
	
	@GetMapping("findUserName/{location}")
	public String findUserNameByLocation(@PathVariable String location) {
		return userService.getfindUserFirstNameByLocation(location);
	}
	 

}
