package Abstract;

import Entities.*;

public interface CampaignService {
	void addCampaign(Game[] games, float discount);
	void updateCampaign(Game[] games, float discount);
	void deleteCampaign(Game[] games);
}
