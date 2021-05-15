package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("DB ye kaydedildi : "+customer.getFirstName());
		
	}

}
