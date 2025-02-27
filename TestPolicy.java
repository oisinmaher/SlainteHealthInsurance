package com.mycompany.projectgui;


public class TestPolicy {

    public static void main(String[] args) {
        // Declares and creates an instance of customer class
        
        // Policy Class 1
        Policy p1 = new Policy(1, "Individual Policy", "Public Hospital", "Standard", 0.0f);
        System.out.println(p1.toString());
        System.out.println("\n");
        System.out.println("Policy 1 Info");
        System.out.println("-----------------");
        System.out.println(p1.toString());
        System.out.println("\n");
        
        // Policy class 2  
        System.out.println("Policy 2 Info");
        System.out.println("-----------------");   

        Policy p2 = new Policy(2, "Individual Policy", "Comprehensive", "Enhanced",0.0f);
        System.out.println(p2.toString());
        System.out.println("\n");
        
        // Policy 3
        System.out.println("Policy 3 Info");
        System.out.println("-----------------");
        
        Policy p3 = new Policy(3, "Individual Policy", "Selective Private Hospitals", "Standard", 0.00f);        
        System.out.println(p3.toString());
        System.out.println("\n");
        System.out.println("Policy 4 Info");
        System.out.println("-----------------");
        //Policy 4
 
        Policy p4 = new Policy(4, "Individual Policy", "Public Hospitals", "Standrd", 0.0f);        
        System.out.println(p4.toString());
        
        System.out.println("\n");
        System.out.println("policy 5 Info");
        System.out.println("-----------------");
        // Policy 5

        Policy p5 = new Policy(5, "Corporate Policy", "Comprehensive Hospital Cover", "Comprehensive ", 0.0f);  
        System.out.println(p5.toString());
        
        System.out.println("\n");
        System.out.println("Policy 6 Info");
        System.out.println("-----------------"); 
        
        // Policy 6

       Policy p6 = new Policy(6, "Individual Policy", "Selected Private Hospitals", "Enhanced", 0.00f);  
        System.out.println(p6.toString());
        
        
           System.out.println("\n");
           System.out.println("Policy 7 Info");
           System.out.println("-----------------");
        // Policy 7
   
        Policy p7 = new Policy(7, "Corporate Policy", "Public Hospitals", "Standard", 0.00f); 
        System.out.println(p7.toString());
        
           System.out.println("\n");
           System.out.println("Policy 8 Info");
           System.out.println("-----------------");
        
        // Policy 8

        Policy p8 = new Policy(8, "Individual Policy", "Public Hospitals", "Comprehensive", 0.00f); 
        System.out.println(p8.toString());
        
        
        
             
    }
    
    
}
