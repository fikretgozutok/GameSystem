package Concrete;

import Abstract.CustomerService;
import Entities.Customer;
import Abstract.CustomerCheckService;

public class CustomerManager implements CustomerService {

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void add(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Müþteri eklendi : " + customer.getFirstName());
		}
		else {
			System.out.println("Kullanýcý doðrulama hatasý...");
		}
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi :" + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " + customer.getFirstName());
		
	}

}
