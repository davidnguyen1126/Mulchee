package com.example.Mulchee.model.store;
import com.example.Mulchee.model.Base;
import com.example.Mulchee.model.userbase.usertype.Chef;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Store extends Base {

    private String name;
    private String address;
    private String city;
    private String cuisineType;
    private String stateOrProvince;
    private String zipCode;
    private String country;

    @ManyToOne(optional = false)
    @JoinColumn(name="chef_id", nullable=false, referencedColumnName = "id")
    private Chef chef;
}
