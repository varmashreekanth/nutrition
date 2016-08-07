pakcage com.fitness.nutrition.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("nutritionService")
public class NutritionServiceImpl implements NutritionService{

	@Autowired
	private NutritionDao nutritionDao;

	public NutritionDao getNutritionDao(){
		return nutritionDao;
	}

	public void setNutritionDao(NutritionDao nutritionDao){
		this.nutritionDao=nutritionDao;
	}
	
	@Override
	public String getNutritionDetails(String nameOfTheFood){
		return nutritionDao.getNutritionDetails(nameOfTheFood);
	}
}