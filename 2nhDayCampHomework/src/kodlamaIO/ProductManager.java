package kodlamaIO;

public class ProductManager {
	
	public void addToCard(Product product) {
		System.out.println("Setepe Eklendi: "+ product.courseName);

	}
	
	public void getByCategory(Category category) {
		System.out.println(category.categoryName +" kategorisi listelendi!");
	}
}
