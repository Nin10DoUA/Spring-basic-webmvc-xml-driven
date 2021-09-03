package com.example.basicwebmvcxmldriven.models;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

    @NotNull
    @Pattern(regexp = "[a-z]*", message = "only small characters")
    @Size(min = 3,message = "ahahahah, thats my message, size should be more than 3 symbols")
    private String firstName;

    @NotNull
    @Size(min = 3,message = "ahahahah, thats my message, size should be more than 3 symbols")
    private String lastName;

    @NotNull
    @Min(value = 18, message = "at least 18 y.o. to enter!")
    private int age;

    public Customer() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
