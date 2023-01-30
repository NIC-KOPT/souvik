package com.nic.souvik.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.nic.souvik.model.RequestModel;

@RestController
public class Frontcontroller {

	@Autowired
	private NicEmployeeController nicEmployeeController;
	@Autowired
	private Environment env;
	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(Frontcontroller.class);
	@Autowired
	RequestModel RequestModel;
	double start_time = 0.0;
	double end_time = 0.0;
	@GetMapping("/welcome")
	public ResponseEntity<?> welcome() {
		return ResponseEntity.ok("Welcome to Front Controller -- 4th Commit");	
	}
	@GetMapping("/")
	public String root() {
		logger.info("Root service is called");
		start_time= System.currentTimeMillis();
		System.out.println("This is root service of SP Architecture");
		end_time = System.currentTimeMillis();
		logger.info("Root service end TTL: "+((end_time - start_time) / 1000) + "sec");
		return "This is root  of SP Architecture";
	}
	@GetMapping("/error")
	public String error() {
		System.out.println("This is error service of SP Architecture");

		return "This is error service  of SP Architecture";
	}
	@GetMapping("/status")
	public String status() {
		System.out.println("Your are in Instance : "+env.getProperty("local.server.port") +" of SP Architecture");

		return "SPArchitecture Instance : "+ env.getProperty("local.server.port") ;
	}
	@GetMapping("/getallemp")
	public ResponseEntity<?> fetchallEmployees(@RequestHeader Map<String, String> header) throws Exception {
		RequestModel.setHeader(header);
		return ResponseEntity.ok(nicEmployeeController.fetchallEmployees(RequestModel));
		}
	@PostMapping("/getemp")
	public ResponseEntity<?> fetchEmployee(@RequestBody Map<String, String> body , @RequestHeader Map<String, String> header ) throws Exception {
		System.out.println("body " +body);
		System.out.println("header"+ header);
		RequestModel.setBody(body);
		RequestModel.setHeader(header);
	return ResponseEntity.ok(nicEmployeeController.fetchEmployee(RequestModel));
	}
	@PostMapping("/setemp")
	public ResponseEntity<?> saveEmployee(@RequestBody Map<String, String> body , @RequestHeader Map<String, String> header ) throws Exception {
		System.out.println("body " +body);
		System.out.println("header"+ header);
		RequestModel.setBody(body);
		RequestModel.setHeader(header);
	return ResponseEntity.ok(nicEmployeeController.saveEmployee(RequestModel));
	}

}
