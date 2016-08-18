package com.fitness.nutrition.repositories;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Repository
public interface NutritionRepository extends MongoRepository<Nutrition,String>{
	List<Nutrition> findByFoodItem(String foodItem);
}
