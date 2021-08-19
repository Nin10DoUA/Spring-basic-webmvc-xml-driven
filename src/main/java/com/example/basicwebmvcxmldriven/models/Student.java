package com.example.basicwebmvcxmldriven.models;

import java.util.LinkedHashMap;

public class Student {


    private String firstName;
    private String lastName;
    private String country;
    private String countryDropDown;
    private LinkedHashMap<String, String> countryOptions;



    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("UA","Ukraine");
        countryOptions.put("USA","United States");
        countryOptions.put("FR","France");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getCountryDropDown() {
        return countryDropDown;
    }

    public void setCountryDropDown(String countryDropDown) {
        this.countryDropDown = countryDropDown;
    }
}
