package com.mycompany.projectgui;
import java.util.ArrayList;

public class TestCustomer {

    public static void main(String[] args) {
      
        // Declares and creates an instance of customer class
        
        // Customer Class 1
//        Customer c1 = new Customer();
//        c1.setFirstName("Donal");
//        c1.setSurName("Molloy");
//        c1.setGender("Male");
//        c1.setAge("Under 35");
//        // Creating an ArrayList for health conditions
//        ArrayList<String> healthConditionsC1 = new ArrayList<>();
//        healthConditionsC1.add("Bone Marrow and Immune System");
//        healthConditionsC1.add("Lungs"); 
//        c1.setPreviousHealthConditions(healthConditionsC1);  
//        c1.setSmoker("No");
//        c1.setOther("No");
//        
//        System.out.println(c1.getFirstName());
//        System.out.println(c1.getSurName());
//        System.out.println(c1.getGender());
//        System.out.println(c1.getAge());
//        System.out.println(c1.getPreviousHealthConditions());
//        System.out.println(c1.getSmoker());
//        System.out.println(c1.getOther());
        System.out.println("Customer 1 Info");
        System.out.println("-----------------");
    
        ArrayList<String> healthConditionsC1 = new ArrayList<>();
        healthConditionsC1.add("Bone Marrow and Immune System");
        healthConditionsC1.add("Lungs");         
        Customer c1 = new Customer("Donal", "Molloy", "Male", "Under 35", healthConditionsC1, "Smoker", "Yes" );
        System.out.println(c1.toString());
        System.out.println("\n");
        
        // Customer class 2  
        System.out.println("Customer 2 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC2 = new ArrayList<>();
        healthConditionsC2.add("None");
        Customer c2 = new Customer("Elma", "Falvey", "Female", "35 to 55 inclusive", healthConditionsC2, "Smoker", "Yes");
        System.out.println(c2.toString());
        System.out.println("\n");
        
        // Customer 3
        System.out.println("Customer 3 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC3 = new ArrayList<>();
        healthConditionsC3.add("Cancer");
        Customer c3 = new Customer("Donald", "Power", "Male", "Under 35", healthConditionsC3, "Smoker", "yes");        
        System.out.println(c3.toString());
        System.out.println("\n");
        
        //Customer 4
        System.out.println("Customer 4 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC4 = new ArrayList<>();
        healthConditionsC4.add("Lungs");
        Customer c4 = new Customer("Paul", "Kiely", "Male", "Over 70", healthConditionsC4, "Non-smoker", "No");        
        System.out.println(c4.toString());
        System.out.println("\n");
        
        // Customer 5
        System.out.println("Customer 5 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC5 = new ArrayList<>();
        healthConditionsC5.add("Kidneys");
        Customer c5 = new Customer("Paddy", "Murphy", "Male", "56 to 75 inclusive", healthConditionsC5, "Smoker", "No"); 
        System.out.println(c5.toString());
        System.out.println("\n");
        
        // Customer 6
        System.out.println("Customer 6 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC6 = new ArrayList<>();
        healthConditionsC6.add("Infections");
        healthConditionsC6.add("Kidneys");
        Customer c6 = new Customer("Chuck", "Norris", "Male", "Under 35", healthConditionsC6, "Non-smoker", "Yes"); 
        System.out.println(c6.toString());
        System.out.println("\n");
        
        // Customer 7
        System.out.println("Customer 7 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC7 = new ArrayList<>();
        healthConditionsC7.add("Bone Marrow and Immune System");
        healthConditionsC7.add("Lungs");
        Customer c7 = new Customer("Barry", "Kavana", "Male", "35 to 55 inclusive", healthConditionsC7, "Non-smoker", "No"); 
        System.out.println(c7.toString());
        System.out.println("\n");
        
        // Customer 8
        System.out.println("Customer 8 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC8 = new ArrayList<>();
        healthConditionsC8.add("None");
        Customer c8 = new Customer("Daniel", "Tisdall", "Male", "35 to 55 inclusive", healthConditionsC8, "Smoker", "No"); 
        System.out.println(c8.toString());
    }
    
}
