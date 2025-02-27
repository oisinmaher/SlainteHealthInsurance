
package com.mycompany.projectgui;

public class CorporatePolicy extends Policy {

    public CorporatePolicy() {
         super(); // invoking the super class contructor
    }
 public CorporatePolicy(int id, String policyType, String hospitalCover, String dayToDayExpense, float total){
 
          super(id , policyType , hospitalCover , dayToDayExpense , total);
   }

  public CorporatePolicy(int id, String policyType, String hospitalCover, String dayToDayExpense){
 
          super(id , policyType , hospitalCover , dayToDayExpense);
   }
 
   
     public float calculate(Customer customer) {
        // TODO implement here
        //gross premium
        //net premium x0.9f
        
        //return net premium
        return super.calculate(customer) * 0.9f;
        
        
    }

    public String toString() {
        // TODO implement here
        return super.toString();
    }

}