package org.bridgelabz.iplwebapp.dao;

import org.bridgelabz.iplwebapp.model.User;

public interface UserDAO {

	public User addUser(User user);
	public boolean findByLogin(String userName, String password);
	public boolean findByUserName(String userName);
}
