package com.mycompany.projectgui;

import java.util.*;

public class Policy {
    //instance variables after class declaration
    private int id;
    private String policyType;
    private String hospitalCover;
    private String dayToDayExpense;
    private float total;
    
    
    
    
    //Constructors (** See Jelly/ Rectangle examples)

    //Full constructor
    
 
    public Policy(int id, String policyType, String hospitalCover, String dayToDayExpense, float total) {
        
        this.id = id;
        this.policyType = policyType;
        this.hospitalCover = hospitalCover;
        this.dayToDayExpense = dayToDayExpense;
        this.total = total;
    }

    public Policy(int id, String policyType, String hospitalCover, String dayToDayExpense) {
        this.id = id;
        this.policyType = policyType;
        this.hospitalCover = hospitalCover;
        this.dayToDayExpense = dayToDayExpense;
    }

    
      
    
    
    //Constructor when have the policy id

    public Policy(int id) {
        this.id = id;
    }

    public Policy() {
    }

    
     
    
  
    public int getId(){
        return this.id;
    }
    
    public String getPolicyType() {
       
        return this.policyType;
    }



    
    public String GetHospitalCover() {
        // TODO implement here
        return this.hospitalCover;
    }

    public String GetdayTodayExpense() {
        // TODO implement here
        return this.dayToDayExpense;
    }

    
    public float getTotal() {
        // TODO implement here
        return this.total;
    }

   
    public void setId(int id) {
        // TODO implement here
     this.id = id;
    }

  
    public void setHospitalCover(String hospitalCover) {
        // TODO implement here
       this.hospitalCover = hospitalCover;
    }

    
    public void setPolicyType(String policyType) {
        // TODO implement here
      this.policyType = policyType;
    }

    
    public void setDayToDayExpense(String dayToDayExpense) {
        // TODO implement here
      this.dayToDayExpense = dayToDayExpense;
    }

   
    public void setTotal(float total) {
        // TODO implement here
       this.total = total;
    }



   
    public float calculate(Customer customer) {
        // Foop Brief Appendix 2 
        
      
        
         //Check the age
            if (customer.getAge().equals("Over 70"))
            {
                //no quote provided
                total = -1f;
                System.out.println("********   No QOUTE PROVIDED    *******");
                
            }
            else 
            {
                //Set the total equal to the general base 
                total = 200;
                



            //Check the gender
            if (customer.getGender().equals("Male"))
            {
                total = total * 2;
                System.out.println("Male: "+ total); 
            }

            else if (customer.getGender().equals("Female"))
            {
                total = total * 0.70f;
                 System.out.println("\nFemale: "+ total);
            }



            if (customer.getAge().equalsIgnoreCase("Under 35"))
            {
               total = total * 1.2f;
                System.out.println("\nUnder 35: "+ total); 
            }

            else if (customer.getAge().equalsIgnoreCase("35 to 55 Inclusive"))
            {
               total = total * 1.40f;
                System.out.println("\n35 to 55 : "+ total);
            }

            else if (customer.getAge().equalsIgnoreCase("56 to 70 Inclusive"))
            {
                 total = total * 1.65f;    
                  System.out.println("\n56-70 : "+ total);
            }





        //Check for existing health conditions

        if(!customer.getPreviousHealthConditions().isEmpty()){

            ArrayList previousHealthConditions = (ArrayList)customer.getPreviousHealthConditions();

            for(int i=0; i<previousHealthConditions.size(); i++){
                //check previous health coonditions
                switch(previousHealthConditions.get(i).toString()){
                    case "Bone Marrow":
                        total = total * 1.2f;
                        System.out.println("\nBone Marrow: "+ total);
                        break;

                    case "Cancer":
                        total = total * 1.25f;
                         System.out.println("\nCancer : "+ total);
                        break;

                    case "Cardiovascular disease":
                        total = total * 1.3f;
                        break;

                    case "Gastrointestinal":
                        total = total * 1.1f;
                        break;

                    case "Infections":
                        total = total * 1.1f;
                        System.out.println("\nInfections: "+ total);
                        break;

                    case "Kidneys":
                        total = total * 1.25f;
                        System.out.println("\nKidneys: "+ total);
                        break;

                    case "Lungs":
                        total = total * 1.25f;
                        System.out.println("\nLungs: "+ total);

                        break;

                    case "Musculoskeletal":
                        total = total * 1.3f;
                        break;

                    case "None":
                         System.out.println("\nNone : "+ total);
                        break;  
                   
                        //no change to total


                }
            }




                }





                //check for other 

                if(customer.getOther().equals("No"))
                {
                  //no change to the total
                    System.out.println("\n:no other health problems "+ total);
                }

                else if (customer.getOther().equals("Yes"))
                {
                    total = total * 1.5f;
                     System.out.println("\nYes more health problems: "+ total);
                }




                //check for smoker
                if(customer.getSmoker().equals("Yes"))
                {
                    total = total + 75;
                     System.out.println("\nSmoker : "+ total);
                }

                else if (customer.getSmoker().equals("No"))
                {
                    total = total - 100;
                    System.out.println("\nnot smoker: "+ total);
                }



                //check for hospital cover

                if(hospitalCover.equals("Public Hospital"))
                {
                    // no change to total
                    System.out.println("\nPublic Hospital: "+ total);
                }

                else if(hospitalCover.equals("Selected Private Hospitals"))
                {
                    total = total * 1.2f;
                     System.out.println("\nPrivate : "+ total);
                }

                else if(hospitalCover.equals("Comprehensive Hospital Cover"))
                {
                    total = total * 1.3f;
                     System.out.println("\nComprehensive: "+ total);
                }




                //check for day to day expenses

                if(dayToDayExpense.equals("Standard"))
                {
                    //no change to total 
                    System.out.println("\nStandard : "+ total);
                }

                else if(dayToDayExpense.equals("Enhanced"))
                {
                    total = total * 1.2f;
                     System.out.println("\nEnhanced : "+ total);
                }

                else if(dayToDayExpense.equals("Comprehensive"))
                {
                    total = total * 1.3f;
                     System.out.println("\nComprehensive : "+ total);
                }
            

            
                                    
               
            } //end outer if 
        
            return total;
    } //end calculate method  


    @Override
    public String toString() {
        // TODO implement here
        return "ID.:" + id +
                "\nPolicytype: " + policyType +
                "\nhospitalCover: " +hospitalCover +
                "\ndayToDayExpense:" +dayToDayExpense +
                "\ntotal:" + total;
                
    }
    





}