package com.example.Mulchee.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Base {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private Date dateCreated;

    private Date dateModified;
}
