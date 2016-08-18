package com.fitness.nutrition.dao;

import java.util.List;
import org.apache.log4j.Logger;
import com.fitness.nutrition.bean.Nutrition;
import com.fitness.nutrition.repositories.NutritionRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Qualifier("nutritionDao")
public class NutritionDaoImpl implements NutritionDao{
	
	private static final Logger LOGGER = Logger.getLogger(NutritionDaoImpl.class);	

	@Autowired
	private NutritionRepository nutritionRepository;

	@Override
	public List<Nutrition> getNutritionDetails(String foodItem) throws Exception{
		LOGGER.info("Entry :: getNutritionDetails ");
		List<Nutrition> nutritionDetailsList = nutritionRepository.findByFoodItem(foodItem);
		LOGGER.info("Exit :: getNutritionDetails "+nutritionDetailsList.size());
		return nutritionDetailsList;
	}
}