package interfaceAbstractDemo.concrete;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfrealPerson(Customer customer) {

		return true;
	}

}
