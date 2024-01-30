package com.tempo.api.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.tempo.api.model.User;

@DataJpaTest
class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	TestEntityManager entityManager;
	
	private User user;

	@BeforeEach
	void setUp() throws Exception {
		user=new User(1L, "rachna", "saxena", "rsaxena", "hyd");
		entityManager.persist(user);
	}

	

	@Disabled
	void testwhenFindByID_thenReturnUser() {
		User user=userRepo.findById(1L).get();
		assertEquals(user.getFirstName(), "rachna");
	}

}
