package com.casestudy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.casestudy.model.BookingModel;

class BookingModelTest {

	BookingModel admin;

	@BeforeEach
	public void before() {
		admin = new BookingModel(123456, "akki", "Akshat", "7905854194", "akshat@gmail.com", "15015", "Gkp Exp", "Gorakhpur", "Varansi", "2022-07-19", 1);
	}

	@AfterEach
	public void after() {
		admin = null;
	}

	@Test
	void testGetPnrId() {
		assertEquals(123456, admin.getPnrId());
	}

	@Test
	void testGetUserId() {
		assertEquals("akki", admin.getUserId());
	}

	@Test
	void testGetName() {
		assertEquals("Akshat", admin.getName());
	}

	@Test
	void testGetPhnnumber() {
		assertEquals("7905854194", admin.getPhnnumber());
	}

	@Test
	void testGetEmail() {
		assertEquals("akshat@gmail.com", admin.getEmail());
	}

	@Test
	void testGetTrainNo() {
		assertEquals("15015", admin.getTrainNo());
	}

	@Test
	void testGetTrainName() {
		assertEquals("Gkp Exp", admin.getTrainName());
	}

	@Test
	void testGetFrom() {
		assertEquals("Gorakhpur", admin.getFrom());
	}

	@Test
	void testGetTo() {
		assertEquals("Varansi", admin.getTo());
	}

	@Test
	void testGetDate() {
		assertEquals("2022-07-19", admin.getDate());
	}

	@Test
	void testGetTotalseats() {
		assertEquals(1, admin.getTotalseats());
	}

	@Test
	void testsetPnrId() {
		admin.setPnrId(12345);
		assertEquals(12345, admin.getPnrId());
	}

	@Test
	void testsetUserId() {
		admin.setUserId("akki1");
		assertEquals("akki1", admin.getUserId());
	}

	@Test
	void testsetName() {
		admin.setName("Akshat1");
		assertEquals("Akshat1", admin.getName());
	}

	@Test
	void testsetPhnnumber() {
		admin.setPhnnumber("7845123265");
		assertEquals("7845123265", admin.getPhnnumber());
	}

	@Test
	void testsetEmail() {
		admin.setEmail("akshat@gmail.com");
		assertEquals("akshat@gmail.com", admin.getEmail());
	}

	@Test
	void testsetTrainNo() {
		admin.setTrainNo("15016");
		assertEquals("15016", admin.getTrainNo());
	}

	@Test
	void testsetTrainName() {
		admin.setTrainName("Lko Exp");
		assertEquals("Lko Exp", admin.getTrainName());
	}

	@Test
	void testsetFrom() {
		admin.setFrom("Varansi");
		assertEquals("Varansi", admin.getFrom());
	}

	@Test
	void testsetTo() {
		admin.setTo("Lucknow");
		assertEquals("Lucknow", admin.getTo());
	}

	@Test
	void testsetDate() {
		admin.setDate("12:43");
		assertEquals("12:43", admin.getDate());
	}

	@Test
	void testsetTotalseats() {
		admin.setTotalseats(120);
		assertEquals(120, admin.getTotalseats());
	}


}