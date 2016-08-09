package com.fitness.nutrition.dao;

import java.util.List;
import org.apache.log4j.Logger;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

@Qualifier("nutritionDao")
public class NutritionDaoImpl implements NutritionDao{
	
	private static final Logger LOGGER = Logger.getLogger(NutritionDaoImpl.class);	

	@Autowired
	private NutritionRepository nutritionRepository;

	@Override
	public List<Nutrition> getNutritionDetails(String nameOfTheFood){
		List<Nutrition> nutritionDetailsList = nutritionRepository.findByGtin_nm(nameOfTheFood);
		return nutritionDetailsList;
	}
}