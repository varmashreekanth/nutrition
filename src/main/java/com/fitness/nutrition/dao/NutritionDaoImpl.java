package com.fitness.nutrition.dao;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

@Qualifier("nutritionDao")
public class NutritionDaoImpl implements NutritionDao{
	

	@Autowired
	private NutritionRepository nutritionRepository;

	@Override
	public List<Nutrition> getNutritionDetails(String nameOfTheFood){
		List<Nutrition> nutritionDetailsList = nutritionRepository.findByGtin_nm(nameOfTheFood);
		return nutritionDetailsList;
	}
}