package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;//*
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
//* interface ve miras classlarýnýn referans tutucu özelliði olduðu için,
//Logger(interface) tipindeki loggers deðiþkenine constructorda hangi loglama sýnýfý gönderildiyse,
//loggers o loglama sýnýfýný tutur. Bu loglama sýnýflarý DatabaseLogger, EmailLogger ve diðerleridir.
//Buradaki bu yapý Dependencen Injection'dýr. Gevþek baðýmlýlýk vardýr.



