package com.ahl.springbootpostgrescrudexample.datamodel;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ads_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String phone;
    private String location;
    private String password;

}
