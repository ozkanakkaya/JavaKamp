package gameShopSimulator;

import java.time.LocalDate;

import abstracts.BasePlayerManager;
import adapters.MernisServiceAdapter;
import concrete.CampaingManager;
import concrete.GameManager;
import concrete.PlayerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Player;
import entities.Sale;

public class Main {

	public static void main(String[] args) {

		BasePlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		playerManager.register(new Player(1, "ozkky", "Özkan", "Akkaya", LocalDate.parse("1111-01-1"), "11111111111"));
		
		GameManager gameManager=new GameManager();
		gameManager.add(new Game(1,"Crysis","Nano giysini kuþan ve dünyayý kurtar!",500));
		
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.add(new Campaign(1, "Muhteþem Cuma", 20));
		
		SaleManager saleManager=new SaleManager();
		saleManager.add(new Sale(1, new Game(1,"Crysis","Nano giysini kuþan ve dünyayý kurtar!",500), 
									new Player(1, "ozkky", "Özkan", "Akkaya", LocalDate.parse("1111-01-1"), "11111111111")));
		
		saleManager.add(new Sale(1, new Game(1,"Crysis","Nano giysini kuþan ve dünyayý kurtar!",500), 
									new Player(1, "ozkky", "Özkan", "Akkaya", LocalDate.parse("1111-01-1"), "11111111111")),
						new Campaign(1, "Muhteþem Cuma", 20));

	}

}
