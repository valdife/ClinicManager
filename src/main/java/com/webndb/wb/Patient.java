package com.webndb.wb;


import com.webndb.address.Address;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Patient")
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer pesel;
    private Integer height;
    private Integer weight;
//    @OneToMany(
//            mappedBy = "patient",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private Set<Address> patientAddresses;

    protected Patient() {
    }


    public Patient(String firstName, String lastName, Integer pesel, Integer height, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.height = height;
        this.weight = weight;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

