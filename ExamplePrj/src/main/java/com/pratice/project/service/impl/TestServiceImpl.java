package com.pratice.project.service.impl;

import org.springframework.stereotype.Service;

import com.pratice.project.model.Name;
import com.pratice.project.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public Name getName(String name) {
		// TODO Auto-generated method stub
		Name Testreturn = new Name();
		Testreturn.setName(name);
		return Testreturn;
	}

}
