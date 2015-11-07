package com.pratice.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.project.model.Name;
import com.pratice.project.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testservice;
	
	@RequestMapping(value = "/test/rest", method = RequestMethod.GET)
	public Name getName(HttpServletRequest request, HttpServletResponse response) {
		Name rt=testservice.getName("jiwon");	
		return rt;
	}
}