package com.pratice.project.dao;

import com.pratice.project.model.Name;
import com.pratice.project.model.User;

public interface IGetDao {
	public Name selectName(String name);
	public User selectUser(String userID);
	public void addUser(User user);
}
