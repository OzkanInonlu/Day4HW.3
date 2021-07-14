package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService{

	@Override
	public void addGame(Player player,Game game) {
		System.out.println(game.getGameName() + ", " + player.getFirstName() + " hesabýna eklendi" + 
				"\nGameId : " + game.getGameId() + "\nOyun Fiyatý : " + game.getGamePrice());
	}

	@Override
	public void deleteGame(Player player,Game game) {
		System.out.println(game.getGameName() + ", " + player.getFirstName() + " hesabýndan silindi" + 
				"\nGameId : " + game.getGameId());
	}
	@Override
	public void changePriceByDiscount(Player player,Game game,Campaign campaign) {
		
		double newPrice;
		newPrice=(game.getGamePrice()-game.getGamePrice()*campaign.getCampaignDiscount()/100);
		
		game.setGamePrice(newPrice);
		System.out.println(game.getGameName() + " için " + player.getFirstName() + " hesabýna indirim yapýldý" +
				"\nGameId : " + game.getGameId() + "\nYeni fiyat : " + game.getGamePrice());
	}

}







