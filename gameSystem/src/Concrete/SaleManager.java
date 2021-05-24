package Concrete;

import Abstract.SaleService;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void sale(Customer customer, Game[] games) {
		double totalPrice = 0;
		for(Game game : games) {
			totalPrice+=game.getSalesPrice();
		}
		
		System.out.println("Oyunlarýn toplam tutarý : " + totalPrice);
		System.out.println("Satýn alýnan hesap : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
}
