package org.bridgelabz.iplwebapp.dao.impl;

import org.bridgelabz.iplwebapp.dao.TeamDAO;
import org.bridgelabz.iplwebapp.database.TeamDatabase;
import org.bridgelabz.iplwebapp.model.Team;

public class TeamDAOImpl implements TeamDAO {

	private TeamDatabase teamDatabase;

	public Team addTeam(Team team) {
		return ((TeamDAO) teamDatabase).addTeam(team);
	}
}
