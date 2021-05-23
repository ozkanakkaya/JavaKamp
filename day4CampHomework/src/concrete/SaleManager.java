package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		System.out.println("Sayýn "+sale.getPlayer().getFirstName()+" "+
				sale.getPlayer().getLastName()+" "+
				sale.getGame().getGameName()+" adlý oyunu satýn aldýnýz."+
				" Ödenen Tutar(TL) : "+ sale.getGame().getPrice()
				);
		
	}

	@Override
	public void add(Sale sale, Campaign campaign) {
		System.out.println("Sayýn "+sale.getPlayer().getFirstName()+" "+
				sale.getPlayer().getLastName()+" "+
				sale.getGame().getGameName()+" adlý oyunu "+
				campaign.getCampaignName()+" kampanyasýndan yararlanarak % "+
				campaign.getDiscountPercent()+" indirimli satýn aldýnýz.\n"+
				"Ödenen Ýndirimli Tutar(TL) : "+ (sale.getGame().getPrice()-(sale.getGame().getPrice()*(campaign.getDiscountPercent()/100)))
				);
		
	}

}
