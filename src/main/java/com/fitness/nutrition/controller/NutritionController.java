package com.fitness.nutrition.controller;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bean.annotation.RequestMapping;


@Controller
public class NutritionController{

	private Static final Logger LOGGER = Logger.getLogger(NutritionController.class);

	@Autowired
	private NutritionService nutritionService;

	public NutritionService getNutritionService(){
		return nutritionService;
	}

	public void setNutritionService(NutrionService nutritionService){
		this.nutritionService=nutritionService;
	}

	@RequestMapping("fitness/nutrition-details.do")
	public String getNutrients(Map model,HttpServletRequest request,HttpServletResponse response){

		LOGGER.info("Entry :: getNutrients() method");

		String nameOfTheFood = (String)request.getParameter("foodItem");
		List<Nutrition> nutritionDetailsList = nutritionService.getNutritionDetails(nameOfTheFood);
		model.put("nutritionDetailsList",nutritionDetailsList);

		LOGGER.info("Exit :: getNutrients() method");
		return "nutritrientsDetail";
	}
	
}