package com.example.Mulchee.model.food;

import com.example.Mulchee.model.Base;

import javax.persistence.Entity;

@Entity
public class Food extends Base {

    private String foodName;

    private long price;

    private String description;

    private String category;

    private long chefId;
}
