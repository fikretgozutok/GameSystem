package Entities;

import Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	private double priceAfterCampaign;
	private boolean isAtCampaign;
	
	
	public Game(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getPriceAfterCampaign() {
		return priceAfterCampaign;
	}


	public void setPriceAfterCampaign(double priceAfterCampaign) {
		this.priceAfterCampaign = priceAfterCampaign;
	}


	public boolean isAtCampaign() {
		return isAtCampaign;
	}


	public void setAtCampaign(boolean isAtCampaign) {
		this.isAtCampaign = isAtCampaign;
	}
	
	public double getSalesPrice() {
		if(isAtCampaign) {
			return priceAfterCampaign;
		}
		return price;
	}
	
}
