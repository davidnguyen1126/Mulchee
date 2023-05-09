package com.example.Mulchee.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Base {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @CreationTimestamp
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;
}
