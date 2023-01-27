package com.nic.souvik.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nic.souvik.model.RequestModel;
import com.nic.souvik.model.ResponseModel;


@RestController
public class NicEmployeeControllerImpl implements NicEmployeeController{

	@Autowired
	com.nic.souvik.service.NicEmployeeService NicEmployeeService;

	@Override
	public ResponseModel fetchallEmployees(RequestModel RequestModel) {
		return NicEmployeeService.fetchAllEmployee( RequestModel);
	}

	@Override
	public ResponseModel fetchEmployee(RequestModel RequestModel) {
		return NicEmployeeService.fetchEmployee(RequestModel);
	}

	@Override
	public ResponseModel saveEmployee(RequestModel RequestModel) {
		// TODO Auto-generated method stub
		return NicEmployeeService.saveEmployee(RequestModel);
	}

	@Override
	public ResponseModel saveallEmployee(RequestModel RequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel deleteEmployee(RequestModel RequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel deleteallEmployee(RequestModel RequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel updateEmployee(RequestModel RequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseModel updateallEmployee(RequestModel RequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
