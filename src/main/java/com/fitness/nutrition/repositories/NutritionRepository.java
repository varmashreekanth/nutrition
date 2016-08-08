package com.fitness.nutrition.repositories;

import java.util.List;
import com.fitness.nutrition.bean.Nutrition;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface NutritionRepository extends MongoRepository(Nutrition,String){
	List<Nutrition> findByGtin_nm(String gtin_nm);
}