package com.pratice.project.service;

import com.pratice.project.model.Name;
import com.pratice.project.model.STAT;
import com.pratice.project.model.User;

public interface TestService {
public Name getName(String name);
public User getUser(String id);
public STAT addUser(User user);
}
