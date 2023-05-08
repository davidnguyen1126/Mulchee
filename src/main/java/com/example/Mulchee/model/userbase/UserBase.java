package com.example.Mulchee.model.userbase;

import com.example.Mulchee.model.Base;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public abstract class UserBase extends Base {

    public String firstName;

    public String lastName;

    public String email;

    public String address;

    public String city;

    public String stateOrProvince;

    public long zipCode;

    public String country;

    public long phoneNumber;

    public Date lastLoginDate;

}
