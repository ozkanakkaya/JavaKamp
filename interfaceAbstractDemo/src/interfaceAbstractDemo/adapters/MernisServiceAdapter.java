package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfrealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	    boolean result = false;
	    
		try 
		{
			result = client.TCKimlikNoDogrula
					(
					Long.parseLong(customer.getNationalityId()) , 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear()
					);
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}

		return result;

	}

}
