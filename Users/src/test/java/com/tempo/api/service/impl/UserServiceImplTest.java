package com.tempo.api.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.tempo.api.dao.UserRepository;
import com.tempo.api.model.User;
import com.tempo.api.service.UserService;

@SpringBootTest
class UserServiceImplTest {
	@Autowired
	UserService userservice;
	
	@MockBean
	UserRepository userRepo;
	
	@BeforeEach
	void setUp(){
		User usr=new User((long) 1, "rachna", "saxena", "rsaxena", "hyd");
		Mockito.when(userRepo.getUserFirstNameBylocation(usr.getLocation())).thenReturn(usr.getFirstName());
		
	}

	
	@Disabled
	void testGetfindUserFirstNameByLocation() {
		fail("Not yet implemented");
		String location="india";
		String user=userservice.getfindUserFirstNameByLocation(location);
		assertEquals(location, user);
	}

}
