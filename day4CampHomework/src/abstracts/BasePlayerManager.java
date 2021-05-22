package abstracts;

import entities.Player;

public class BasePlayerManager implements PlayerService {

	@Override
	public void register(Player player) {
		System.out.println("Oyuncu kaydedildi! : "+player.getUserName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncunun bilgisi güncellendi! : "+player.getUserName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi! : "+player.getUserName());
		
	}

}
