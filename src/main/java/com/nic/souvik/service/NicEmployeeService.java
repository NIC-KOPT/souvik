package com.nic.souvik.service;


import org.springframework.stereotype.Service;

import com.nic.souvik.model.RequestModel;
import com.nic.souvik.model.ResponseModel;


@Service
public interface NicEmployeeService {
	public ResponseModel fetchEmployee(RequestModel RequestModel);
	public ResponseModel fetchAllEmployee(RequestModel RequestModel);
	public ResponseModel saveEmployee(RequestModel RequestModel );
	public ResponseModel saveallEmployee(RequestModel RequestModel );	
	public ResponseModel deleteEmployee(RequestModel RequestModel );
	public ResponseModel deleteallEmployee(RequestModel RequestModel );	
	public ResponseModel updateEmployee(RequestModel RequestModel );
	public ResponseModel updateallEmployee(RequestModel RequestModel);
	public boolean testgateway(RequestModel RequestModel );
	public boolean validateToken(RequestModel RequestModel );
}
