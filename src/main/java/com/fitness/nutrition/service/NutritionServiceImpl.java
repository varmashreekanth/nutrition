pakcage com.fitness.nutrition.service;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
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
	public List<Nutrition> getNutritionDetails(String nameOfTheFood){
		return nutritionDao.getNutritionDetails(nameOfTheFood);
	}
}