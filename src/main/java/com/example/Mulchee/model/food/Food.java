package com.example.Mulchee.model.food;

import com.example.Mulchee.model.Base;
import com.example.Mulchee.model.store.Store;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Food extends Base {

    private String foodName;

    private long price;

    private String description;

    private String category;

    @ManyToOne(optional = false)
    @JoinColumn(name="store_id", nullable=false, referencedColumnName = "id")
    private Store store;
}
