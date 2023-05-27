package com.example.Mulchee.model.userbase.usertype;

import com.example.Mulchee.model.food.Food;
import com.example.Mulchee.model.userbase.UserBase;
import com.example.Mulchee.model.store.Store;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name= "chef")
public class Chef extends UserBase {

    @OneToMany(mappedBy = "chef", cascade = CascadeType.ALL)
    private List<Store> stores;
}
