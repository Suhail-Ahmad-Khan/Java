package org.bridgelabz.iplwebapp.dao.impl;

import org.bridgelabz.iplwebapp.dao.UserDAO;
import org.bridgelabz.iplwebapp.database.UserDatabase;
import org.bridgelabz.iplwebapp.model.User;

public class UserDAOImpl implements UserDAO {

	private UserDatabase userDatabase;

	public User addUser(User user) {
		return ((UserDAO) userDatabase).addUser(user);
	}

	public boolean findByLogin(String userName, String password) {
		User user = userDatabase.findByUserName(userName);

		if (user != null && user.getPassword().equals(password)) {
			return true;
		}

		return false;
	}

	public boolean findByUserName(String userName) {
		User user = userDatabase.findByUserName(userName);

		if (user != null) {
			return true;
		}

		return false;
	}
}
