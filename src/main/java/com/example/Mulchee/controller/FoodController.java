package com.example.Mulchee.controller;

import com.example.Mulchee.model.food.Food;
import com.example.Mulchee.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GET
    @RequestMapping("/getFoodById")
    public ResponseEntity<Map<String, Object>> getFoodById(@Param("id") long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("Food", foodService.getFoodById(id));
        } catch (Exception e) {
            response.put("Error", e.getCause());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @POST
    @RequestMapping("/addFood")
    public ResponseEntity<String> addFood(@RequestBody Food food) {
        try {
            foodService.addFood(food);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Food Added");
    }

    @DELETE
    @RequestMapping("/deleteFoodById")
    public ResponseEntity<String> deleteFoodById(@Param("id") long id) {
        try {
            foodService.deleteFoodById(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Food deleted");
    }
}