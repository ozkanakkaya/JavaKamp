package entities;

import abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String gameName;
	private String description;
	private double price;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, String description, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
