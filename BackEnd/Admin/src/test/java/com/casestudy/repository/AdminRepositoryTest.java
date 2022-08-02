package com.casestudy.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.casestudy.model.AdminModel;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class AdminRepositoryTest {
	//Object of PaymentRepositoryTest to communicate with Repository
		@Autowired
		private AdminRepository repository;
		
		
		private AdminModel user1;
	    private AdminModel user2;
	    List<AdminModel> UserList;
	    LocalDate myDate1;
	    
	    @BeforeEach
	    public void setUp() {
	    UserList=new ArrayList<>(); 
	    myDate1 =LocalDate.parse("2022-05-14");
	    user1= new AdminModel("1","Tejas","12345678"); //user input
	    user2= new AdminModel("2","Yash","123456");  //user input 
	    UserList.add(user1);
	    UserList.add(user2);
	    }
	    
	    @AfterEach
	    public void tearDown() {
	    	user2 = null;
	    	user1=null;
	    	UserList = null;
	    }
		 
	    //Test CAse for adding User NAme
		@Test
		public void givenUserShouldReturnUserObject() {
			repository.save(user1);  // Data is saved in Database
			AdminModel p2= repository.findById(user1.getId()).get(); //Fetching the data from DataBase
			assertNotNull(p2);  //To check if it returning the Passenger Object
			assertEquals(user1.getUsername(),p2.getUsername());		
		}

		
		
		//Test Case for getByUserDetail Implementation
		@Test
		public void givenIdThenShouldReturnUserOfThatId() {
			repository.save(user2);
		     Optional<AdminModel> optional =  repository.findById(user2.getId());
		     assertEquals(user2.getId(), optional.get().getId());
		     assertEquals(user2.getUsername(), optional.get().getUsername());
		}
}

