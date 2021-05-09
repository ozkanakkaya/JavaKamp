package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao ProductDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		ProductDao = productDao;
	}

	@Override
	public List<Product> getAll() {

		return this.ProductDao.findAll();
	}

}
