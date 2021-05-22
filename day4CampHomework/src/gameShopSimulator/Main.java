package gameShopSimulator;

import java.time.LocalDate;

import abstracts.BasePlayerManager;
import adapters.MernisServiceAdapter;
import concrete.PlayerManager;
import entities.Player;

public class Main {

	public static void main(String[] args) {

		BasePlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		playerManager.register(new Player(1, "ozkky", "Özkan", "Akkaya", LocalDate.parse("1992-03-13"), "26341772338"));

	}

}
