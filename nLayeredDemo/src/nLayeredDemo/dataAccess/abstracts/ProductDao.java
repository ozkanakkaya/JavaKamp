package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {//ProductRepository þeklinde de isimlendirilebilirdi.
	//ürün ekleme,listeleme, güncelleme yazýlabilir
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();//Listelerle çalýþýrken List kullanacaðýz. .Netteki karþýlýðý IList tir.
	
}
