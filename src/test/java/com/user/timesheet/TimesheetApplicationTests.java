package com.user.timesheet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TimesheetApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	    
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testApiStatus() {
		 ResponseEntity<String> response = this.restTemplate.getForEntity("http://127.0.0.1:" + port + "/timesheet",
	                String.class);
	        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
	        ResponseEntity<String> responseOne = this.restTemplate.getForEntity("http://127.0.0.1:" + port + "/timesheet/new",
	                String.class);
	        Assertions.assertEquals(responseOne.getStatusCode(), HttpStatus.OK);
	}

}
