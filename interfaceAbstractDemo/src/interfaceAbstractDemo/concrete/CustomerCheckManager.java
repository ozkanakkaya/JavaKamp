package interfaceAbstractDemo.concrete;

import org.apache.axis.utils.tcpmon;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfrealPerson(Customer customer) {

		return true;
	}

}
