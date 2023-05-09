package com.example.Mulchee.model.userbase;

import com.example.Mulchee.model.Base;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class UserBase extends Base {

    private String firstName;

    private String lastName;

    private String email;

    private String address;

    private String city;

    private String stateOrProvince;

    private long zipCode;

    private String country;

    private long phoneNumber;

}
