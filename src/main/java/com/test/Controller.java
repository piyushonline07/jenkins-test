package com.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/getUserName")
	public ResponseEntity<String> getUserName() {
		System.out.println("called");
		return new ResponseEntity<String>("abhinav",HttpStatus.OK);
	}
}
