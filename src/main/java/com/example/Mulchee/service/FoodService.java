package com.example.Mulchee.service;

import com.example.Mulchee.model.food.Food;
import com.example.Mulchee.repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    FoodRepo foodRepo;

    public Food getFoodById(long id) {
        return foodRepo.getReferenceById(id);
    }

    public void addFood(Food consumer) {
        foodRepo.save(consumer);
    }

    public void deleteFoodById(long id) {
        foodRepo.deleteById(id);
    }
}
