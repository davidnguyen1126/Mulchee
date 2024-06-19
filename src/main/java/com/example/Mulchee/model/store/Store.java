package com.example.Mulchee.model.store;
import com.example.Mulchee.model.Base;
import com.example.Mulchee.model.userbase.usertype.Chef;
import com.example.Mulchee.model.food.Food;
import lombok.Data;

import java.util.List;

import javax.persistence.*;

@Data
@Entity
public class Store extends Base {

    private String name;
    private String address;
    private String city;
    private String cuisineType;
    private String stateOrProvince;
    private long zipCode;
    private String country;

    @ManyToOne(optional = false)
    @JoinColumn(name="chef_id", nullable=false, referencedColumnName = "id")
    private Chef chef;
    private long chefId;


    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Food> menu;

    public long getChefId() {
        return chefId;
    }
}
