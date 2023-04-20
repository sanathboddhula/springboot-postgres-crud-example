package com.ahl.springbootpostgrescrudexample.datamodel;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ads_user", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "phone" }) })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    private String location;

    @Column(nullable = false)
    private String password;

}
