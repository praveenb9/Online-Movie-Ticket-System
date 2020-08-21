package com.capg.omts.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.Customer;
import com.capg.omts.user.model.UserCredentials;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UserServiceTest {

	@Autowired
	IUserService userService;
	
	 Admin admin;
	 Customer customer;
	 
	 
	@BeforeAll
	  void setUp()
	{
		admin=new Admin(1980,"praveen", "09878987", LocalDate.of(1998,9,28),"9988778899");
		customer=new Customer(12987656, "kanisk", "98765678", LocalDate.of(1998,6,5), new ArrayList<>(), "9874563214");
		
	}
	@Test
	void testAddAdmin() {
		
		Admin newAdmin=userService.addAdmin(admin);
		assertEquals(admin, newAdmin);
	}

	@Test
	void testGetUserByUserIdAndPassword() {
		UserCredentials credentials=userService.getUserByUserIdAndPassword(1980, "09878987");
		assertEquals("admin", credentials.getUserType());
	}

	@Test
	void testAddCustomer() {
		Customer newCustomer=userService.addCustomer(customer);
		assertEquals(customer, newCustomer);
	}

}
