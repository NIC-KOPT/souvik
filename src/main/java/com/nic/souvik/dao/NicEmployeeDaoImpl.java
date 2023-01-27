package com.nic.souvik.dao;


import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nic.souvik.model.NicEmployee;
import com.nic.souvik.model.RequestModel;
import com.nic.souvik.model.ResponseModel;


@Repository
@EnableTransactionManagement
public class NicEmployeeDaoImpl implements NicEmployeeDao{

	@Autowired
	public org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	@Autowired
	ResponseModel ResponseModel; 
	@Override
	public ResponseModel fetchallEmployees(RequestModel RequestModel) {
		try {
		String query= "Select * from nicemployee";
		List<NicEmployee> NicEmployee= JdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(NicEmployee.class));
		ResponseModel.setData(NicEmployee);
		}catch(Exception x) {
			System.out.println(x);
		}
		System.out.println(JdbcTemplate.getQueryTimeout());
		return ResponseModel;
	}

	@Override
	public ResponseModel fetchEmployee(RequestModel RequestModel) {
		Map<String, String> m= RequestModel.getBody();
		m.get("id");
		try {
		String query= "Select * from nicemployee where id=\'"+m.get("id")+"\'";
		List<NicEmployee> NicEmployeeResult= JdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(NicEmployee.class));
		ResponseModel.setData(NicEmployeeResult);
		}catch(Exception x) {
			System.out.println(x);
		}
		System.out.println(JdbcTemplate.getQueryTimeout());
		return ResponseModel;
	}

	@Override
	public ResponseModel saveEmployee(RequestModel RequestModel) {
		Map<String, String> m= RequestModel.getBody();
		try {
		String query= "Insert into nicemployee(id,fname,mname,lname,address,age, bdate, salary) values(?,?,?,?,?,?,?,?)";
		int x= JdbcTemplate.update(query, m.get("id"),m.get("fname"),m.get("mname"), m.get("lname"),m.get("address"),Integer.parseInt(m.get("age")),Date.valueOf(m.get("bdate")),Double.parseDouble(m.get("salary")));
		ResponseModel.setData(x);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println(JdbcTemplate.getQueryTimeout());
		return ResponseModel;
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
