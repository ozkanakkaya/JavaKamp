package kodlamaIO;

public class Main {

	public static void main(String[] args) {

		Product product1=new Product(1, "C#-Angular Kamp�", 17, "Engin Demiro�");
		
		Product product2=new Product(2, "Java-React Kamp�", 17, "Engin Demiro�");
		
		Category category=new Category(1,"Yaz�l�m E�itimleri");
		
		Product[] product= {product1,product2};
		
		for (Product products : product) {
			System.out.println(products.courseName);
		}
		
		
		ProductManager productManager=new ProductManager();
		productManager.addToCard(product1);
		productManager.getByCategory(category);
		
	}

}
