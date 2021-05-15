package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concrete.NeroCustomerManager;
import interfaceAbstractDemo.concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Özkan", "Akkaya", LocalDate.parse("1111-11-11"), "11111111111"));
	
		BaseCustomerManager customerManager2=new NeroCustomerManager();
		customerManager2.Save(new Customer(1, "Özkan", "Akkaya", LocalDate.parse("1111-11-11"), "11111111111"));
	}
}
