package com.nic.souvik.dao;


import org.springframework.stereotype.Repository;

import com.nic.souvik.model.RequestModel;
import com.nic.souvik.model.ResponseModel;

@Repository
public interface NicEmployeeDao {
	public ResponseModel fetchallEmployees(RequestModel RequestModel);
	public ResponseModel fetchEmployee(RequestModel RequestModel);
	public ResponseModel saveEmployee(RequestModel RequestModel);
	public ResponseModel saveallEmployee(RequestModel RequestModel);	
	public ResponseModel deleteEmployee(RequestModel RequestModel);
	public ResponseModel deleteallEmployee(RequestModel RequestModel);	
	public ResponseModel updateEmployee(RequestModel RequestModel);
	public ResponseModel updateallEmployee(RequestModel RequestModel);	
}
