package com.fitness.nutrition.dao;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;

public interface NutritionDao{
	
	public List<Nutrition> getNutritionDetails(String nameOfTheFood);
}
