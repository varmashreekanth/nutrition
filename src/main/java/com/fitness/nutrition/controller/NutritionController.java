package com.fitness.nutrition.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.fitness.nutrition.bean.Nutrition;
import com.fitness.nutrition.service.NutritionService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;


@Controller
public class NutritionController{

	private static final Logger LOGGER = Logger.getLogger(NutritionController.class);

	@Autowired
	private NutritionService nutritionService;

	public NutritionService getNutritionService(){
		return nutritionService;
	}

	public void setNutritionService(NutritionService nutritionService){
		this.nutritionService=nutritionService;
	}

	@RequestMapping(value="/.do",method=RequestMethod.GET)
	public String getWelcomePage(ModelMap model){
		LOGGER.info("Entry :: getWelcomePage");
		model.put("nutrition",new Nutrition());
		LOGGER.info("Exit :: getWelcomePage");
		return "index";
	}

	@RequestMapping("nutrition-details.do")
	public String getNutrients(Map model,HttpServletRequest request,HttpServletResponse response){

		LOGGER.info("Entry :: getNutrients() method");

		try{
			String foodItem = (String)request.getParameter("foodItem");
			LOGGER.info("name of the food "+foodItem);
			List<Nutrition> nutritionDetailsList = nutritionService.getNutritionDetails(foodItem);
			model.put("nutritionDetailsList",nutritionDetailsList);
		}
		catch(Exception e){
			LOGGER.error("Error while fetching the nutrition details ",e);
		}

		LOGGER.info("Exit :: getNutrients() method");
		return "nutritrientsDetail";
	}
	
}