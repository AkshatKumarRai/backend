package com.casestudy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.casestudy.model.AdminModel;

class AdminModelTest {

	AdminModel admin;

	@BeforeEach
	public void before() {
		admin = new AdminModel("124", "Akki", "123");
	}

	@AfterEach
	public void after() {
		admin = null;
	}

	@Test
	void testGetId() {
		assertEquals("124", admin.getId());
	}

	@Test
	void testgetUsername() {
		assertEquals("Akki", admin.getUsername());
	}

	@Test
	void testgetPassword() {
		assertEquals("123", admin.getPassword());
	}

	@Test
	void testsetId() {
		admin.setId("125");
		assertEquals("125", admin.getId());
	}

	@Test
	void testsetUsername() {
		admin.setUsername("Akki1");
		assertEquals("Akki1", admin.getUsername());
	}

	@Test
	void testsetPassword() {
		admin.setPassword("124");
		assertEquals("124", admin.getPassword());
	}

}