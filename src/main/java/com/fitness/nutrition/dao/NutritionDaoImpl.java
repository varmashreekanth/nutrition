package com.fitness.nutrition.dao;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("nutritionDao")
public class NutritionDaoImpl implements NutritionDao{
	
	@Override
	public String getNutritionDetails(String nameOfTheFood){
		
	}
}