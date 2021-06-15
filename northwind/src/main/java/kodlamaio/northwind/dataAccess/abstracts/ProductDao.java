package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
//açıklamaları bu linkte:https://www.notion.so/Northwind-day-3-a7ad8da8ede04530afc087afc7e315c6
public interface ProductDao extends JpaRepository<Product, Integer> {
	Product getByProductName(String productName);

	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	List<Product> getByCategoryIn(List<Integer> categories);//kategori id'si verilen kategori id'lerinin içinden herhangi biri olan veri/verileri istiyoruz.
	
	List<Product> getByProductNameContains(String productName);//ürün adı, parametre olarak verilen değeri içeren veri/verileri istiyoruz.
	
	List<Product> getByProductNameStartsWith(String productName);//ürün adı, parametre olarak verilen değerle başlayan veri/verileri istiyoruz.
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")//Product burada classtır
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
