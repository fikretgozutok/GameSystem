package gameSystem;

import java.time.LocalDate;

import Adapter.MernisCheckService;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.SaleManager;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer(
				1,
				"Fikret",
				"Gözütok",
				LocalDate.of(2000, 12, 31),
				"12345679810");
		
		Customer c2 = new Customer(
				2,
				"Ýsmail",
				"Demir",
				LocalDate.of(2000, 12, 31),
				"12345678910");

		CustomerManager customerManager = new CustomerManager(new MernisCheckService());
		customerManager.add(c1);
		
		Game g1 = new Game(
				1,
				"GTA V",
				180);
		
		Game g2 = new Game(
				2,
				"CS:GO",
				70);
		
		Game g3 = new Game(
				3,
				"RDR2",
				300);
		
		Game g4 = new Game(
				4,
				"Rainbow Six Siege",
				80);
		
		Game[] cart = {g1, g2, g3, g4};
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(c1, cart);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(cart, 50);
		campaignManager.updateCampaign(cart, 100);
		saleManager.sale(c2, cart);
	}

}
