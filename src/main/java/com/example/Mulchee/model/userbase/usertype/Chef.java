package com.example.Mulchee.model.userbase.usertype;

import com.example.Mulchee.model.food.Food;
import com.example.Mulchee.model.userbase.UserBase;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
//@Table(name = "chef")
public class Chef extends UserBase {

    public String storeName;

    public String foodType;

    @OneToMany
    public List<Food> foodOfferings;
}
