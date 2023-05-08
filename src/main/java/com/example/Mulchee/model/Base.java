package com.example.Mulchee.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public abstract class Base {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long id;

    public Date dateCreated;

    public Date dateModified;
}
