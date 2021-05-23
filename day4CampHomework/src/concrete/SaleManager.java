package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		System.out.println("Say�n "+sale.getPlayer().getFirstName()+" "+
				sale.getPlayer().getLastName()+" "+
				sale.getGame().getGameName()+" adl� oyunu sat�n ald�n�z."+
				" �denen Tutar(TL) : "+ sale.getGame().getPrice()
				);
		
	}

	@Override
	public void add(Sale sale, Campaign campaign) {
		System.out.println("Say�n "+sale.getPlayer().getFirstName()+" "+
				sale.getPlayer().getLastName()+" "+
				sale.getGame().getGameName()+" adl� oyunu "+
				campaign.getCampaignName()+" kampanyas�ndan yararlanarak % "+
				campaign.getDiscountPercent()+" indirimli sat�n ald�n�z.\n"+
				"�denen �ndirimli Tutar(TL) : "+ (sale.getGame().getPrice()-(sale.getGame().getPrice()*(campaign.getDiscountPercent()/100)))
				);
		
	}

}
