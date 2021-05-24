package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {//ProductRepository �eklinde de isimlendirilebilirdi.
	//�r�n ekleme,listeleme, g�ncelleme yaz�labilir
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();//Listelerle �al���rken List kullanaca��z. .Netteki kar��l��� IList tir.
	
}
