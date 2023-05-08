package com.example.Mulchee.repo;

import com.example.Mulchee.model.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "food", path="food")
public interface FoodRepo extends JpaRepository<Food, Long> {

}