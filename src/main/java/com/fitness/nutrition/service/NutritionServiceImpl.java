package com.fitness.nutrition.service;

import java.util.List;
import org.apache.log4j.Logger;
import com.fitness.nutrition.bean.Nutrition;
import com.fitness.nutrition.dao.NutritionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("nutritionService")
public class NutritionServiceImpl implements NutritionService{

	private static final Logger LOGGER = Logger.getLogger(NutritionServiceImpl.class);

	@Autowired
	private NutritionDao nutritionDao;

	public NutritionDao getNutritionDao(){
		return nutritionDao;
	}

	public void setNutritionDao(NutritionDao nutritionDao){
		this.nutritionDao=nutritionDao;
	}
	
	@Override
	public List<Nutrition> getNutritionDetails(String foodItem) throws Exception{
		LOGGER.info("Inside  getNutitionDetails() in the NutritionServiceImpl");
		return nutritionDao.getNutritionDetails(foodItem);
	}
}