package entities;

public class Campaign {

	private int id;
	private String campaignName;
	private double discountPercent;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, double discountPercent) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
}
