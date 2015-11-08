package com.pratice.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.project.dao.IGetDao;
import com.pratice.project.model.Name;
import com.pratice.project.model.STAT;
import com.pratice.project.model.User;
import com.pratice.project.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private IGetDao mapper;
	
	@Override
	public Name getName(String name) {
		// TODO Auto-generated method stub
		Name Testreturn = mapper.selectName(name);
		return Testreturn;
	}
	
	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		User user=mapper.selectUser(id);
		return user;
	}

	@Override
	public STAT addUser(User user) {
		// TODO Auto-generated method stub
		STAT stat =new STAT();
		try{
		mapper.addUser(user);
		stat.setStat("success");
		return stat;
		}catch(Exception e){
		stat.setStat("fail");
		stat.setCause(e.getMessage());
		return stat;	
		}
	}
	

}
