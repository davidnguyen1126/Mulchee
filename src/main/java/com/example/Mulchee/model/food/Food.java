package com.example.Mulchee.model.food;

import com.example.Mulchee.model.Base;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Food extends Base {

    private String foodName;

    private long price;

    private String description;

    private String category;

    private long chefId;
}
