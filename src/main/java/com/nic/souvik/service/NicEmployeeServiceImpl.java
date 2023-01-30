package com.nic.souvik.service;


import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nic.souvik.dao.NicEmployeeDao;
import com.nic.souvik.model.RequestModel;
import com.nic.souvik.model.ResponseModel;



@Service
public class NicEmployeeServiceImpl implements NicEmployeeService{

	@Autowired
	NicEmployeeDao nicEmployeeDao;
	@Autowired
	RestTemplate restTemplate;
	@Override
	public ResponseModel fetchEmployee(RequestModel RequestModel) {
		//unpack header to check host and other details and add validation of data. 
//		if(testgateway(RequestModel))
//		return null;
//		if(!validateToken(RequestModel))
//		return null;
		return nicEmployeeDao.fetchEmployee(RequestModel);
	}

	@Override
	public ResponseModel fetchAllEmployee(RequestModel RequestModel) {
//		if(testgateway(RequestModel))
//			return null;
//			if(!validateToken(RequestModel))
//			return null;
			return nicEmployeeDao.fetchallEmployees(RequestModel);
	}

	@Override
	public ResponseModel saveEmployee(RequestModel RequestModel) {
		return nicEmployeeDao.saveEmployee(RequestModel);
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

	@Override
	public boolean testgateway(RequestModel RequestModel) {
		Map<String, String> head= RequestModel.getHeader();
		if (head.get("x-forwarded-host")==null || !head.get("x-forwarded-host").equals("localhost:3031"))
		return true;
		else
		return false;
	}

	@Override
	public boolean validateToken(RequestModel RequestModel) {
		Map<String, String> header= RequestModel.getHeader();
		String Bearertoken= header.get("authorization");
		String token= Bearertoken.substring(7);

		Map<String, String> map= new HashMap<String, String>();
		map.put("token", token);
		System.out.println(map);
		ResponseModel res=restTemplate.postForObject("http://localhost:3034/auth/verifytoken", map ,ResponseModel.class);
		//restTemplate.exchange("http://localhost:3034/auth/verifytoken",org.springframework.http.HttpMethod.POST, null ,ResponseModel.class);
		//restTemplate.postForObject("http://localhost:3034/auth/verifytoken", HttpEntity ,ResponseModel.class, map);
		System.out.println(res.getData());
		Boolean response = (Boolean) res.getData();
		return response;
	}

}
