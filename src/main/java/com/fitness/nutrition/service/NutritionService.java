package com.fitness.nutrition.service;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.stereotype.Service;


@Service
public interface NutritionService{

	public List<Nutrition> getNutritionDetails(String foodItem) throws Exception;
}