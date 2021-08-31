


/**
 * Write a description of class StafHire here.
 * amoung all the class, staff hire parent class and has two sub child class. this class three attributes of different types.
 * First constructor class is created for those attributes with a corresponding acess modifiers (getter and setter method)
 * At last display method is created to print output of the attributes 
 * @author (Ishan gurung)
 * @version (30 dec 2019)
 */
      

     public class StaffHire //this is the superclass, parent class
     { 
     //variable decleration
     private int Vacancynumber;
     private String Designation;
     private String JobType;
      
      // creating the constructor class   
    StaffHire(int Vacancynumber,String Designation, String JobType)
    {
      this.Vacancynumber=Vacancynumber;
      this.Designation=Designation;
      this.JobType=JobType;
    }
    
    //Setter and getter method of staffHire class's variable
     public void setVacancynumber(int Vacancynumber)
     {
         this.setVacancynumber(Vacancynumber);
        }  
        
      public int getVacancynumber()
     {
         return Vacancynumber;
      } 
      
        public void setDesignation(String Designation)
        {
            this.Designation="Designation";
        }
        
        public String getDesignation()
        {
            return Designation;
        }
    
      public void setJobType(String Jobtype)
      {
        this.JobType=JobType;
        }
        
        public String getJobType()
        {
            return JobType;
        }
        //end of getter and setter
        public void display()//creating methhod for value display
        {
            //calling of getters method
            System.out.println("The Vacancy number="+this.getVacancynumber());
            System.out.println("The Designation="+this.getDesignation());
            System.out.println("The JobType="+this.getJobType());
        
        }
    }
    
    
    
    
   
    
    
    