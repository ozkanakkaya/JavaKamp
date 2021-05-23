package abstracts;

import entities.Campaign;
import entities.Sale;

public interface SaleService {
	void add(Sale sale);
	void add(Sale sale,Campaign campaign);
}	
