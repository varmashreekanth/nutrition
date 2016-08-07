package com.fitness.nutrition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bean.annotation.RequestMapping;
import org.springframework.web.bean.annotation.ResponseBody;

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
	public @ResponseBody String getNutrients(Model map,HttpServletRequest request,HttpServletResponse response){

		String nameOfTheFood = (String)request.getParameter("foodItem");
		return nutritionService.getNutritionDetails(nameOfTheFood);
	}
	
}