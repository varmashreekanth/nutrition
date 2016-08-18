package com.fitness.nutrition.dao;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionDao{
	
	public List<Nutrition> getNutritionDetails(String foodItem) throws Exception;
}
