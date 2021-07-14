package Abstract;

import Entities.Player;
import Entities.Campaign;
import Entities.Game;

public interface GameService {
	
	public void addGame(Player player,Game game);
	public void deleteGame(Player player,Game game);
	void changePriceByDiscount(Player player,Game game, Campaign campaign);
	
}
