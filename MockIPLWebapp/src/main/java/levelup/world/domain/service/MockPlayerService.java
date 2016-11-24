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
		Player player1 = new Player(1, 1, "Virat Kohli", "batsman", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player2 = new Player(2, 2, "Bhubaneshwar Kumar", "bowler", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player3 = new Player(3, 3, "Andre Russell", "all rounder", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player4 = new Player(4, 4, "Murali Vijay", "batsman", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player5 = new Player(5, 5, "Keiron Pollard", "bowler", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player6 = new Player(6, 6, "Glenn Maxwell", "all rounder", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player7 = new Player(7, 7, "Suresh Raina", "batsman", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));
		Player player8 = new Player(8, 4, "Albie Morkel", "bowler", "right handed", "right handed", "indian",
				parseDate("30-nov-1984"));

		players.put(player1.getId(), player1);
		players.put(player2.getId(), player2);
		players.put(player3.getId(), player3);
		players.put(player4.getId(), player4);
		players.put(player5.getId(), player5);
		players.put(player6.getId(), player6);
		players.put(player7.getId(), player7);
		players.put(player8.getId(), player8);

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

/*
 * HashMap<Integer, LinkedList<Player>> sortedPlayerList = new HashMap<Integer,
 * LinkedList<Player>>(); LinkedList<Player>[] players = new LinkedList[10];;
 * 
 * // COMPUTATION int Value; for (int i = 0; i < playerList.size(); i++) { Value
 * = playerList.get(i).getTeamId();
 * 
 * if (players[Value] == null) { players[Value] = new LinkedList<Player>(); }
 * players[Value].add(playerList.get(i)); sortedPlayerList.put(Value,
 * players[Value]); }
 */