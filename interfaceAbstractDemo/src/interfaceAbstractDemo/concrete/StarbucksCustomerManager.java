package interfaceAbstractDemo.concrete;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
				
		if (customerCheckService.CheckIfrealPerson(customer)) {
			super.Save(customer);			
		}
		else
		{
			System.out.println("Not a valid person");
		}
		

		
	}
}
