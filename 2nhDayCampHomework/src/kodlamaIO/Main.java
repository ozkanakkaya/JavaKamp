package kodlamaIO;

public class Main {

	public static void main(String[] args) {

		Product product1=new Product(1, "C#-Angular Kampý", 17, "Engin Demiroð");
		
		Product product2=new Product(2, "Java-React Kampý", 17, "Engin Demiroð");
		
		Category category=new Category(1,"Yazýlým Eðitimleri");
		
		Product[] product= {product1,product2};
		
		for (Product products : product) {
			System.out.println(products.courseName);
		}
		
		
		ProductManager productManager=new ProductManager();
		productManager.addToCard(product1);
		productManager.getByCategory(category);
		
	}

}
