package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName() + 
				"\nCampaignID : " + campaign.getCampaignId());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName() + 
				"\nCampaignID : " + campaign.getCampaignId());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampaignName() + 
				"\nCampaignID : " + campaign.getCampaignId());
		
	}

}
