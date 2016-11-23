package levelup.world.domain.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import levelup.world.domain.Player;

public class MockPlayerService implements PlayerService {

	private static Map<Integer, Player> players = new HashMap<Integer, Player>();
	private static int nextPlayerId = 200;

	static {
		players.put(1, new Player(1, 1, "Virat Kohli", "batsman", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(2, new Player(2, 2, "Bhubaneshwar Kumar", "bowler", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(3, new Player(3, 3, "Andre Russell", "all rounder", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(4, new Player(4, 4, "Murali Vijay", "batsman", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(5, new Player(5, 5, "Keiron Pollard", "bowler", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(6, new Player(6, 6, "Glenn Maxwell", "all rounder", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(7, new Player(7, 7, "Suresh Raina", "batsman", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
		players.put(8, new Player(8, 4, "Albie Morkel", "bowler", "right handed", "right handed", "indian",
				parseDate("30-nov-1984")));
	}

	private static Date parseDate(String textDate) {
		try {
			return new SimpleDateFormat("dd-MMM-yyyy").parse(textDate);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public Collection<Player> getAllPlayers() {
		return players.values();
	}

	public Player getPlayerById(int playerId) {
		// Returns a new object and not just a reference
		// to an object in the collection.
		Player player = players.get(playerId);
		return new Player(player.getId(), player.getTeamId(), player.getPlayerName(), player.getRole(),
				player.getBattingStyle(), player.getBowlingStyle(), player.getNationality(), player.getDateOfBirth());
	}

	public Player getPlayerByName(String playerName) {
		for (Player player : players.values()) {
			if (player.getPlayerName().toLowerCase().equals(playerName.toLowerCase())) {
				return player;
			}
		}
		return null;
	}

	public void savePlayer(Player player) {
		if (player.isNew()) {
			nextPlayerId++;
			player.setId(nextPlayerId);
			players.put(nextPlayerId, player);
		} else {
			players.put(player.getId(), player);
		}
	}

	public void deletePlayer(Player player) {
		players.remove(player.getId());
	}
}
