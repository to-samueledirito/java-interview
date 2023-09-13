package com.toconsulting.interview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "COUNTRIES")
public class Country {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
    
    public Integer getId() { return this.id; }
    public String getName() { return this.name; }
}
