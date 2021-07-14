import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class App {

	public static void main(String[] args) {
		
		Player player1=new Player(1, "xxxx", "xxxx", "xxxxxxxxxxx", LocalDate.of(2002, 8, 14));
		Player player2=new Player(2, "xxxx", "xxxx", "xxxxxxxxxxx", LocalDate.of(2002, 8, 14));
		
		PlayerManager playerManager=new PlayerManager();
		
		Game gta5=new Game(100, "GTA5", 90);
		Game CsGo=new Game(101, "Cs Go",35);
		GameManager gameManager=new GameManager();
		
		Campaign BlackFriday=new Campaign(11, "Black Friday", 10);
		
		CampaignManager campaignManager=new CampaignManager();
		
		Game Valorant=new Game(102, "Valorant", 50);
		
		try {
			playerManager.register(player1, new MernisServiceAdapter());
			
			gameManager.addGame(player1,gta5);
			gameManager.changePriceByDiscount(player1, gta5, new Campaign(10, "Summer Sale", 20));
			
			campaignManager.updateCampaign(BlackFriday);
			
			gameManager.changePriceByDiscount(player1,CsGo, BlackFriday);
			gameManager.deleteGame(player1,CsGo);
			
			gameManager.addGame(player1, Valorant);
			
			gameManager.changePriceByDiscount(player1, Valorant, new Campaign(12, "Winter Sale", 2));
			
			playerManager.register(player2, new MernisServiceAdapter());
			}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error : " + e.getMessage());
		}
		
	}
	
}
