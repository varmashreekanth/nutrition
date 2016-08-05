package com.fitness.nutrition.dao;

import org.json.JSONObject;

public interface NutritionDao{
	
	public JSONObject getNutritionDetails(String nameOfTheFood);
}
