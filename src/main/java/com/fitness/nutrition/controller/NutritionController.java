package com.fitness.nutrition.controller;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bean.annotation.RequestMapping;


@Controller
public class NutritionController{

	@Autowired
	private NutritionService nutritionService;

	public NutritionService getNutritionService(){
		return nutritionService;
	}

	public void setNutritionService(NutrionService nutritionService){
		this.nutritionService=nutritionService;
	}

	@RequestMapping("fitness/nutrition-details.do")
	public String getNutrients(Model map,HttpServletRequest request,HttpServletResponse response){

		String nameOfTheFood = (String)request.getParameter("foodItem");
		List<Nutrition> nutritionDetailsList = nutritionService.getNutritionDetails(nameOfTheFood);
		map.put("nutritionDetailsList",nutritionDetailsList);
		return "nutritrientsDetail";
	}
	
}