package com.pratice.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.project.model.Name;
import com.pratice.project.model.STAT;
import com.pratice.project.model.User;
import com.pratice.project.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testservice;

	@RequestMapping(value = "/test/rest", method = RequestMethod.GET)
	public Name getName(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "name") String name) {
		Name rt = testservice.getName(name);
		return rt;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User getUser(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "userID") String userID) {
		User rt = testservice.getUser(userID);
		return rt;
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public STAT addUser(HttpServletRequest request, HttpServletResponse response, @RequestBody User user) {
		STAT stat = testservice.addUser(user);
		return stat;

	}
}