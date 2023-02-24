package com.ogbonnaya.CRUD_project2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="employee")
public class Employee {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column (name =" first name", nullable = false)
    private String firstName;
    @Column( name ="Last name")
    private String lastName;

    @Column ( name = " Email")
    private String email;
}
