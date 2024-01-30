package com.tempo.api.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.tempo.api.model.User;
import com.tempo.api.service.UserService;

@WebMvcTest(UsersController.class)
class UsersControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	UsersController controller;
	
	@MockBean
	UserService userService;
	
	private User user;

	@BeforeEach
	void setUp() throws Exception {
		user=new User(1L, "rachna", "saxena", "rsaxena", "hyd");
	}

	@Test
	void testWhenCreateUser_thenReturnUser() throws Exception {
		User inputUser=new User("rachna", "saxena", "rsaxena", "hyd");
		Mockito.when(userService.saveUser(inputUser)).thenReturn(user);
		mockMvc.perform(MockMvcRequestBuilders
			      .post("/user/save")
			      .content(			    	    
			    		  "{\"displayName\":\"rsaxena\",\"firstName\":\"rachna\",\"lastName\":\"saxena\",\"location\":\"hyd\"}"
			    	)
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
		         .andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Disabled
	void testFindUserById() {
		fail("Not yet implemented");
	}

}
