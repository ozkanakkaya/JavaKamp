package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ozkan=new IndividualCustomer();
		ozkan.customerNumber="12345";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		sendikaCustomer.customerNumber="333333";
		
		CustomerManager customerManager=new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(ozkan);
//		customerManager.add(sendikaManager);
		Customer[] customers= {ozkan,hepsiBurada,sendikaCustomer};
		customerManager.addMultiple(customers);
	}

}
