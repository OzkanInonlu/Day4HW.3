package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService{

	@Override
	public void addGame(Player player,Game game) {
		System.out.println(game.getGameName() + ", " + player.getFirstName() + " hesab�na eklendi" + 
				"\nGameId : " + game.getGameId() + "\nOyun Fiyat� : " + game.getGamePrice());
	}

	@Override
	public void deleteGame(Player player,Game game) {
		System.out.println(game.getGameName() + ", " + player.getFirstName() + " hesab�ndan silindi" + 
				"\nGameId : " + game.getGameId());
	}
	@Override
	public void changePriceByDiscount(Player player,Game game,Campaign campaign) {
		
		double newPrice;
		newPrice=(game.getGamePrice()-game.getGamePrice()*campaign.getCampaignDiscount()/100);
		
		game.setGamePrice(newPrice);
		System.out.println(game.getGameName() + " i�in " + player.getFirstName() + " hesab�na indirim yap�ld�" +
				"\nGameId : " + game.getGameId() + "\nYeni fiyat : " + game.getGamePrice());
	}

}







