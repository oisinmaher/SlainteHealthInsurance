package com.mycompany.projectgui;
import java.util.ArrayList;

public class TestCalculations {

    public static void main(String[] args) {
        
        // Declares and creates an instance of customer class
        // Customer Class 1
        System.out.println("Customer 1 Info");
        System.out.println("-----------------");
        //Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC1 = new ArrayList<>();
        healthConditionsC1.add("Bone Marrow and Immune System");
        healthConditionsC1.add("Lungs"); 
        Customer c1 = new Customer("Donal", "Molloy", "Male", "Under 35", healthConditionsC1, "", "Non-smoker" );
        System.out.println(c1.toString());
        System.out.println("\n");
        
        System.out.println("Policy 1 Info");
        System.out.println("-----------------");
        
        // Declares and creates an instance of customer class       
        // Policy Class 1
        IndividualPolicy p1 = new IndividualPolicy(1, "Individual Policy", "Public hospital", "Standard", 0.0f);

        //Calculate the premium for policy 1 for customer 1 
        p1.calculate(c1);
        System.out.println(p1.toString());
        //620 perfect 
        System.out.println("\n");
        System.out.println("Customer 2 Info");
        System.out.println("-----------------");
        
        // Customer class 2          
          
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC2 = new ArrayList<>();
        //healthConditionsC2.add("None");
        Customer c2 = new Customer("Elma", "Falvey", "Female", "35 to 55 Inclusive", healthConditionsC2, "yes", "Smoker");
        System.out.println(c2.toString());
        
        System.out.println("\n");
           
        // Policy class 2     
        IndividualPolicy p2 = new IndividualPolicy(2, "Individual Policy", "Comprehensive Hospital Cover", "Enhanced",00.0f);
        
        
        //Calculate the premium for policy 1 for customer 1 
        p2.calculate(c2); //575.64 perfect 
        
        System.out.println(p2.toString());
        
        System.out.println("\n");
        
        
        
        
        
        

        // Customer 3
        System.out.println("Customer 3 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC3 = new ArrayList<>();
        healthConditionsC3.add("Cancer");
        Customer c3 = new Customer("Donald", "Power", "Male", "Under 35", healthConditionsC3, "No", "Smoker");        
        System.out.println(c3.toString());
        
        // Policy 3


        IndividualPolicy p3 = new IndividualPolicy(3, "Individual Policy", "Selected Private Hospitals", "Standard");        

        
          //Calculate the premium for policy 1 for customer 1 
        p3.calculate(c3); //810 = perfect 
        
        System.out.println(p3.toString());
        
           System.out.println("\n");
        

        //Customer 4  // this works 
        System.out.println("Customer 4 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC4 = new ArrayList<>();
        healthConditionsC4.add("Lungs");
        Customer c4 = new Customer("Paul", "Kiely", "Male", "Over 70", healthConditionsC4, "No", "Non-smoker");        
        System.out.println(c4.toString());
        
        //Policy 4
 
        IndividualPolicy p4 = new IndividualPolicy(4, "Individual Policy", "Public Hospitals", "Standrd");        
        
        
         p4.calculate(c4); //correct 
         
         System.out.println(p4.toString());
        
           System.out.println("\n");
        
        System.out.println("\n");

        
        // Customer 5  //THESE PEOPLE GET 10%
        System.out.println("Customer 5 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC5 = new ArrayList<>();
        healthConditionsC5.add("Kidneys");
        Customer c5 = new Customer("Paddy", "Murphy", "Male", "56 to 70 Inclusive", healthConditionsC5, "yes", "Non-smoker"); 
        System.out.println(c5.toString());
        // Policy 5

       CorporatePolicy p5 = new CorporatePolicy (5, "Corporate Policy", "Comprehensive Hospital Cover", "Comprehensive ");  
        
        
        p5.calculate(c5);
        //1330 with discount 
        System.out.println(p5.toString());
           
           
        System.out.println("\n");
           
        // Customer 6
        System.out.println("Customer 6 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC6 = new ArrayList<>();
        healthConditionsC6.add("Infections");
        healthConditionsC6.add("Kidneys");
        Customer c6 = new Customer("Chuck", "Norris", "Male", "Under 35", healthConditionsC6, "yes", "non-smoker"); 
        System.out.println(c6.toString());
        
        // Policy 6

       IndividualPolicy p6 = new IndividualPolicy(6, "Individual Policy", "Selected Private Hospitals", "Enhanced");  
                        
        System.out.println("\n");
           
        p6.calculate(c6);// 1281 without discount
        System.out.println(p6.toString());
        System.out.println("\n");
            

        // Customer 7 //THESE PEOPLE GET DISCOUNT
        System.out.println("Customer 7 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC7 = new ArrayList<>();
        Customer c7 = new Customer("Barry", "Kavana", "Male", "35 to 55 Inclusive", healthConditionsC7, "No", "Non-smoker"); 
        System.out.println(c7.toString());
        
        // Policy 7s
   
        CorporatePolicy p7 = new CorporatePolicy(7, "Corporate Policy", "Public Hospitals", "Standard"); 
        
        p7.calculate(c7); 
        // 414 with discount
        System.out.println(p7.toString());
        
        System.out.println("\n");
        
        
        // Customer 8
        System.out.println("Customer 8 Info");
        System.out.println("-----------------");
        // Creating an ArrayList for health conditions
        ArrayList<String> healthConditionsC8 = new ArrayList<>();
        healthConditionsC8.add("None");
        Customer c8 = new Customer("Daniel", "Tisdall", "Male", "35 to 55 Inclusive", healthConditionsC8, "No", "Smoker"); 
        System.out.println(c8.toString());
        
         // Policy 8

        IndividualPolicy p8 = new IndividualPolicy(8, "Individual Policy", "Public Hospitals", "Comprehensive"); 
        
        
        p8.calculate(c8);// 825.50 perfect
        System.out.println(p8.toString());
    }
    
}
