package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name,double unitPrice, String detail) {
		this();//Product class �n� �al��t�r�r. Dolay�s�yla di�er constructor da �al���r.
		this.id=id;
		this.name=name;
		this.detail=detail;
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
