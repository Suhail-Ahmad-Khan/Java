package org.bridgelabz.iplwebapp.dao.impl;

import org.bridgelabz.iplwebapp.dao.PlayerDAO;
import org.bridgelabz.iplwebapp.database.PlayerDatabase;
import org.bridgelabz.iplwebapp.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private PlayerDatabase playerDatabase;

	public Player addPlayer(Player player) {
		return ((PlayerDAO) playerDatabase).addPlayer(player);
	}
}
