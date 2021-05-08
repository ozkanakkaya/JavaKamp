package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name,double unitPrice, String detail) {
		this();//Product class ýný çalýþtýrýr. Dolayýsýyla diðer constructor da çalýþýr.
		this.id=id;
		this.name=name;
		this.detail=detail;
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
