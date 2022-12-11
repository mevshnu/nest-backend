package com.example.Nest.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private  String empCode;
    private  String empName;
    private  String empEmail;
    private  String empPhone;
    private  String empDesignation;
    private  String username;


}
