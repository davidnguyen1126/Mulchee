package com.example.Mulchee.model.userbase.usertype;

import com.example.Mulchee.model.food.Food;
import com.example.Mulchee.model.userbase.UserBase;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
public class Consumer extends UserBase {

    @OneToMany
    private List<Chef> favoriteChefs;

    @OneToMany
    private List<Food> favoriteFoods;
}
