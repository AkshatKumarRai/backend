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
		admin = new BookingModel("62d61a94b3ca796335496acc", "akki", "Akshat", "7905854194", "akshat@gmail.com",
				"15015", "Gkp Exp", "Gorakhpur", "Varansi", "2022-07-19", "18:15", 1, 1245);
	}

	@AfterEach
	public void after() {
		admin = null;
	}

	@Test
	void testGetPnrId() {
		assertEquals("62d61a94b3ca796335496acc", admin.getPnrId());
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
	void testGetTrainFrom() {
		assertEquals("Gorakhpur", admin.getTrainFrom());
	}

	@Test
	void testGetTrainTo() {
		assertEquals("Varansi", admin.getTrainTo());
	}

	@Test
	void testGetDate() {
		assertEquals("2022-07-19", admin.getDate());
	}

	@Test
	void testGetTime() {
		assertEquals("18:15", admin.getTime());
	}

	@Test
	void testGetTotalseats() {
		assertEquals(1, admin.getTotalseats());
	}

	@Test
	void testGetFare() {
		assertEquals(1245, admin.getFare());
	}

	@Test
	void testsetPnrId() {
		admin.setPnrId("62d61a94b3ca796335496qww");
		assertEquals("62d61a94b3ca796335496qww", admin.getPnrId());
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
	void testsetTrainFrom() {
		admin.setTrainFrom("Varansi");
		assertEquals("Varansi", admin.getTrainFrom());
	}

	@Test
	void testsetTrainTo() {
		admin.setTrainTo("Lucknow");
		assertEquals("Lucknow", admin.getTrainTo());
	}

	@Test
	void testsetDate() {
		admin.setDate("12:43");
		assertEquals("12:43", admin.getDate());
	}

	@Test
	void testsetTime() {
		admin.setTime("15:16");
		assertEquals("15:16", admin.getTime());
	}

	@Test
	void testsetTotalseats() {
		admin.setTotalseats(120);
		assertEquals(120, admin.getTotalseats());
	}

	@Test
	void testsetFare() {
		admin.setFare(1501);
		assertEquals(1501, admin.getFare());
	}

}