package levelup.world.domain.service;

import java.util.Collection;
import levelup.world.domain.Player;

public interface PlayerService {

	public Collection<Player> getAllPlayers();

	public Player getPlayerById(int playerId);

	public Player getPlayerByName(String playerName);

	public void savePlayer(Player player);

	public void deletePlayer(Player player);
}
