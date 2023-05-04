package com.example.Mulchee.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    private long id;

    public String firstName;

    public String lastName;
}
