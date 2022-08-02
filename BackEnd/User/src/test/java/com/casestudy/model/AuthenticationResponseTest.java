package com.casestudy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.casestudy.model.AuthenticationResponse;

class AuthenticationResponseTest {

	AuthenticationResponse admin;

	@BeforeEach
	public void before() {
		admin = new AuthenticationResponse("Akki123","success");
	}

	@AfterEach
	public void after() {
		admin = null;
	}

	@Test
	void testgetJwt() {
		assertEquals("Akki123", admin.getJwt());
	}

	@Test
	void testsetJwt() {
		admin.setJwt("Akki1234");
		assertEquals("Akki1234", admin.getJwt());
	}
	
	@Test
	void testgetJwtSuccess() {
		assertEquals("success", admin.getSuccess());
	}

	@Test
	void testsetSuccess() {
		admin.setSuccess("Fail");
		assertEquals("Fail", admin.getSuccess());
	}

}