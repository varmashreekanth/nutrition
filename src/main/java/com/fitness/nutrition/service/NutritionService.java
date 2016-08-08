package com.fitness.nutrition.service;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;

public interface NutritionService{

	public List<Nutrition> getNutritionDetails(String nameOfTheFood);
}