/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectgui;

import java.util.ArrayList;

public class GUItest {
    private String firstName;
    private String surName;
    private String gender;
    private String age;
    private ArrayList previousHealthConditions;
    private String other;
    private String smoker; 
    
    
    //constructors know all

    public GUItest(String firstName, String surName, String gender, String age, ArrayList previousHealthConditions, String other, String smoker) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.age = age;
        this.previousHealthConditions = previousHealthConditions;
        this.other = other;
        this.smoker = smoker;
    }

    public GUItest(String firstName, String surName, String gender, String age, String smoker) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.age = age;
        this.smoker = smoker;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//end

