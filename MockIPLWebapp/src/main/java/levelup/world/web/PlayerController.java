package levelup.world.web;

import java.util.Collection;
import levelup.world.domain.Player;
import levelup.world.domain.service.MockPlayerService;
import levelup.world.domain.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

	private PlayerService playerService = new MockPlayerService();

	@RequestMapping("/playerList.html")
	@ModelAttribute("players")
	public Collection<Player> getPlayers() {
		return playerService.getAllPlayers();
	}

	@RequestMapping(value = "/playerDetails.html", params = "id")
	public Player getPlayer(@RequestParam(value = "id", required = true) int playerId) {
		return playerService.getPlayerById(playerId);
	}
}