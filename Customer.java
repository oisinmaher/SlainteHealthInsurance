package com.mycompany.projectgui;

import java.util.ArrayList;

public class Customer {
    
    //Instance Variables
    private String firstName;
    private String surName;
    private String gender;
    private String age;
    private ArrayList previousHealthConditions;
    private String other;
    private String smoker; 

    //Constructors 
    public Customer(String firstName, String surName, String gender, String age, 
            ArrayList previousHealthConditions, String other, String smoker) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.age = age;
        this.previousHealthConditions = previousHealthConditions;
        this.other = other;
        this.smoker = smoker;
    }
    
    // Constructor with no arguments 
    public Customer() {
        this("Unspecified", "Unspecified", "Unspecified", "Unspecified", new ArrayList<>(), "Unspecified", "Unspecified");
    }
    
    //Setter and Getter Methods
    
    public String getFirstName() {
        return this.firstName;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getAge() {
        return this.age;
    }

    public String getSmoker() {
        return this.smoker;
    }

    public ArrayList getPreviousHealthConditions() {
        return this.previousHealthConditions;
    }

    public String getOther() {
        return this.other;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public void setPreviousHealthConditions(ArrayList previousHealthConditions) {
        this.previousHealthConditions = previousHealthConditions;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName +
                "\nSurname: " + surName +
                "\nGender: " + gender +
                "\nAge: " + age +
                "\nSmoker: " + smoker +
                "\nPrevious Health Conditions: " + previousHealthConditions +
                "\nOther: " + other;
    }

    Iterable<String> healthConditions() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}