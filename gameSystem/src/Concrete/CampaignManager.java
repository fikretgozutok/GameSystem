package Concrete;

import Abstract.CampaignService;
import Entities.Game;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Game[] games, float discount) {
		for(Game game : games) {
			double price = game.getPrice() - (game.getPrice() * (discount / 100));
			game.setAtCampaign(true);
			game.setPriceAfterCampaign(price);
		}
		
	}

	@Override
	public void updateCampaign(Game[] games, float discount) {
		for(Game game : games) {
			double price = game.getPrice() - (game.getPrice() * (discount / 100));
			game.setPriceAfterCampaign(price);
		}
		
	}

	@Override
	public void deleteCampaign(Game[] games) {
		for(Game game : games) {
			game.setAtCampaign(false);
			game.setPriceAfterCampaign(game.getPrice());
		}
		
	}

}
