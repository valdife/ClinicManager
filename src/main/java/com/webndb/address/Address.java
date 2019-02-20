package com.webndb.address;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String street;
    private Integer streetNumber;
    private Integer flatNumber;
    private Integer postalCode;
    private String resort;
    private String country;

    protected Address(){}

    public Address(String street, Integer streetNumber, Integer postalCode, String resort, String country){
        this.street = street;
        this.streetNumber = streetNumber;
        this.flatNumber = null;
        this.postalCode = postalCode;
        this.resort = resort;
        this.country = country;
    }

    public Address(String street, Integer streetNumber, Integer flatNumber, Integer postalCode, String resort, String country){
        this.street = street;
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.resort = resort;
        this.country = country;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getResort() {
        return resort;
    }

    public void setResort(String resort) {
        this.resort = resort;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
