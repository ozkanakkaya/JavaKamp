package abstracts;

import entities.Player;

public interface PlayerService {
	
	void register(Player player);
	void update(Player player);
	void delete(Player player);
	
}
