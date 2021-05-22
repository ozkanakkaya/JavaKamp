package concrete;

import abstracts.BasePlayerManager;
import abstracts.PlayerCheckService;
import entities.Player;

public class PlayerManager extends BasePlayerManager {
	
	PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void register(Player player) {
		if (playerCheckService.CheckIfRealPerson(player)) {
			super.register(player);
		}
		else
		{
			System.out.println("Baþarýsýz! Lütfen bilgilerinizi kontrol ediniz!");
		}
		
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		super.update(player);
	}

	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
		super.delete(player);
	}
}
