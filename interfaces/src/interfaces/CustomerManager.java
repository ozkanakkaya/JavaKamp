package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;//*
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

	}
	public void delete(Customer customer) {
		System.out.println("M��teri silindi "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
//* interface ve miras classlar�n�n referans tutucu �zelli�i oldu�u i�in,
//Logger(interface) tipindeki loggers de�i�kenine constructorda hangi loglama s�n�f� g�nderildiyse,
//loggers o loglama s�n�f�n� tutur. Bu loglama s�n�flar� DatabaseLogger, EmailLogger ve di�erleridir.
//Buradaki bu yap� Dependencen Injection'd�r. Gev�ek ba��ml�l�k vard�r.



