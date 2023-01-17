package com.nic.souvik.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Frontcontroller {
	
	@GetMapping("/welcome")
	public ResponseEntity<?> welcome() {
		return ResponseEntity.ok("Welocme to Front Controller ++ 2nd Build ++ 3rd Build ");	
	}

}
