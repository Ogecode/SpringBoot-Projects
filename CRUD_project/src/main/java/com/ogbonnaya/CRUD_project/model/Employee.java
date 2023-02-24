package com.ogbonnaya.CRUD_project.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column (name =" first_name", nullable = false)
    private String firstName;
    @Column( name ="Last_name")
    private String lastName;

    @Column ( name = " Email")
    private String email;
}
