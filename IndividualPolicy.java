package com.mycompany.projectgui;


import java.util.*;

public class  IndividualPolicy extends Policy {
    
  
           
    public IndividualPolicy() {
         super(); // invoking the super class contructor
    }
    
    
 public IndividualPolicy(int id, String policyType, String hospitalCover, String dayToDayExpense, float total){
 
          super(id , policyType , hospitalCover , dayToDayExpense , total);
   }

  public IndividualPolicy(int id, String policyType, String hospitalCover, String dayToDayExpense){
 
          super(id , policyType , hospitalCover , dayToDayExpense);
   }  
 
   
     public float calculate(Customer customer) {
        // TODO implement here
        return super.calculate(customer);
    }

    public String toString() {
        // TODO implement here
        return super.toString();
    }

}