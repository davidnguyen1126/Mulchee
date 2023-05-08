package com.example.Mulchee.model.userbase.usertype;

import com.example.Mulchee.model.food.Food;
import com.example.Mulchee.model.userbase.UserBase;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Chef extends UserBase {

    private String storeName;

    private String foodType;

    @OneToMany
    private List<Food> foodOfferings;
}
