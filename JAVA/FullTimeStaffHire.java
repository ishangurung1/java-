
/**
 * Write a description of class StadHire here.
 *The is the child class of staffHire class.It has seven attributes.
 *constructor class is created with the paramenters of that class of different types of acess modifier.
 *in the constructor super class variables are called.
 *getter and setter method are called and a method is created to check the status of joining
 *finally a display method is created to print the output.
 * @author (Ishan gurung)
 * @version (30 dec 2019)
 */

 //loading of super class in sub class or parent class in sub class
 public class FullTimeStaffHire extends StaffHire//loading of super class in sub class or parent class in sub class
   {        
        
       //insance variable deceleration            
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined; 
   
    //creating costructor class
    FullTimeStaffHire(int Vacancynumber,String Designation,String JobType,int salary,int workingHour)
    {
            super(Vacancynumber,Designation,JobType);
            this.salary=salary;
            this.workingHour=workingHour;
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";            
    }
    
    //getter method 
      public int getsalary()
        {
            return salary;
      }
      
      public int getworkingHour()
      {
          return workingHour;   
        
      }
      
      public String getstaffName()
      {
          return staffName;
        }
        
        public String getjoiningDate()
        {
            return joiningDate;
        }
        
        public String getqualification()
        {
            return qualification;
        }
        
        public String getappointedBy()
        {
            return appointedBy;
        }
        
        public boolean getjoined()
        {
            return joined;
        } 
        //salary inevitably occur
        
        public void setsalary(int salary)
        {
            this.salary=salary;
            if (joined==true)                       
            System.out.println("You have been appointed so, cannot change the salary value"+salary);
        }
          
    
        
        public void setworkingHour(int workingHour)
        {
            this.workingHour=workingHour;
            System.out.println("The new working hour is" +workingHour);
        }
        
   
        public void hireFulltimestaff(String staffName,String joiningDate,String qualification,String appointedBy)
           {
               
               if(joined==true)
               {
                   System.out.println("Staff Name="+staffName);
                   System.out.println("joining Date="+this.joiningDate);
                   
                }
                else
                {
                    this.staffName=staffName;
                    this.joiningDate=joiningDate;
                    this.qualification=qualification;
                    this.appointedBy=appointedBy;
                    joined=true;
                }
            }
            
            //display method for displaying attributes values
            public void display()
            {
                super.display();
                if(joined==true)
                    {
                    System.out.println("StaffName="+this.getstaffName());//calling of getters method
                    System.out.println("workingHour="+this.getworkingHour());
                    System.out.println("joiningDate="+this.getjoiningDate());
                    System.out.println("qualification="+this.getqualification());
                    System.out.println("appointedBy="+this.getappointedBy());
                    
            }
        }
    }
                
                   