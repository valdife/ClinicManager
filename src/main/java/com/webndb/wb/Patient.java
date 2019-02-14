package com.webndb.wb;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private Integer height;
    private Integer weight;


    protected Patient() {}

    public Patient(String firstName, String lastName, String pesel){
        this.firstName = "";
        this.lastName = "";
        this.pesel = "";
    }

    public Patient(String firstName, String lastName, String pesel, Integer height, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.height = height;
        this.weight = weight;
    }

    public Long getId() {
        return id;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
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