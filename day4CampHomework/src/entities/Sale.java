package entities;

import abstracts.Entity;

public class Sale implements Entity {
	
	private int id;
	private Game game;
	private Player player;
	
	public Sale() {
		
	}
	
	public Sale(int id, Game game, Player player) {
		super();
		this.id = id;
		this.game = game;
		this.player = player;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
